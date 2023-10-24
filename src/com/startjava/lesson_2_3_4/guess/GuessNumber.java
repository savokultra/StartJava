package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber;
    private boolean condition;
    Scanner sc = new Scanner(System.in);

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        do {
            generateHiddenNumber();
            playGame();
        } while (!condition);
        arraysReset();
        condition = false;
    }

    private void generateHiddenNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private void playGame() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        do {
            System.out.println("\nПодсказка, искомое число = " + hiddenNumber);
            selectWinner(player1);
            if (condition) {
                break;
            }
            selectWinner(player2);
            if (condition) {
                break;
            }
        } while (!condition);
        showPlayerNumbers(player1);
        showPlayerNumbers(player2);
    }

    /*private boolean checkCondition(Player name) {
        if (name.getAttemptNumber() != 0) {
            if (name.getNumber() == hiddenNumber || name.getAttemptNumber() == 9) {
                condition = true;
            }
        }
        return condition;
    }*/

    private void getPlayerNumbers(int[] inputArray) {
        for (int element : inputArray) {
            if (element != 0) {
                System.out.printf("%s ", element);
            }
        }
    }

    private void showPlayerNumbers(Player name) {
        System.out.print("\nИгрок " + name.getName() + " загадал числа: ");
        getPlayerNumbers(name.getAllNumbers());
    }
    
    private void arraysReset() {
        player1.clear();
        player2.clear();
    }
    
    private boolean selectWinner(Player name) {
        if (name.getAttemptNumber() < 10) {
            System.out.print("\nИгрок " + name.getName() + " введите число ");
            int number = sc.nextInt();
            name.addNumber(number);
            if (name.getNumber() < hiddenNumber) {
                System.out.println("\nЧисло " + name.getNumber() + " меньше загаданного компьютером");
            } else if (name.getNumber() > hiddenNumber) {
                System.out.println("\nЧисло " + name.getNumber() + " больше загаданного компьютером");
            } else {
                System.out.println("\nИгрок " + name.getName() + " угадал число " + name.getNumber() + " с " +
                        name.getAttemptNumber() + " попытки");
                condition = true;
            }
            if (name.getAttemptNumber() == 9) {
                System.out.println("У " + name.getName() + " закончились попытки");
                condition = true;
            }
        }
        return condition;
    }
}
