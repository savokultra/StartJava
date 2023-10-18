package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber;
    private boolean b;
    Scanner sc = new Scanner(System.in);

    public GuessNumber(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
    }

    public void start() {
        do {
            generateHiddenNumber();
            playGame();
        } while (player1.getNumber() != hiddenNumber && player2.getNumber() != hiddenNumber && (player1.getAttemptNumber() < 11 ||
                player2.getAttemptNumber() < 11));
        arraysReset();
    }

    private void generateHiddenNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private void playGame() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        do {
            System.out.println("\nПодсказка, искомое число = " + hiddenNumber);
            selectWinner(player1);
            if (player1.getNumber() == hiddenNumber) {
                break;
            }
            selectWinner(player2);
        } while (checkCondition());
        showPlayerNumbers();
    }

    private boolean checkCondition() {
        if (player1.getNumber() != hiddenNumber && player2.getNumber() != hiddenNumber && (player1.getAttemptNumber() < 11 ||
                player2.getAttemptNumber() < 11)) {
            b = true;            
        }
        return b;
    }

    private void getPlayerNumbers(int[] inputArray) {
        for (int element : inputArray) {
            System.out.printf("%s ", element);
        }
    }

    private void showPlayerNumbers() {
        System.out.print("\nИгрок " + player1.getName() + " загадал числа: ");
        getPlayerNumbers(player1.getAllNumbers());
        System.out.print("\nИгрок " + player2.getName() + " загадал числа: ");
        getPlayerNumbers(player2.getAllNumbers());
    }
    
    private void arraysReset() {
        player1.clear();
        player2.clear();
    }
    
    private void selectWinner(Player name) {
        if (name.getAttemptNumber() < 11) {
            System.out.println("\nИгрок " + name.getName() + " введите число");
            int number = sc.nextInt();
            name.addNumber(number);
            name.setAttemptNumber();
            if (name.getNumber() < hiddenNumber) {
                System.out.println("\nЧисло " + name.getNumber() + " меньше загаданного компьютером");
            } else if (name.getNumber() > hiddenNumber) {
                System.out.println("\nЧисло " + name.getNumber() + " больше загаданного компьютером");
            } else {
                System.out.println("\nИгрок " + player1.getName() + " угадал число " + name.getNumber() + " с " +
                        name.getAttemptNumber() + " попытки");
                return;
            }
        }
        if (name.getAttemptNumber() > 10) {
            System.out.println("У " + name.getName() + " закончились попытки");
            return;
        }
    }
}
