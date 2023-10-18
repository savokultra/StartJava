package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber;
    Scanner sc = new Scanner(System.in);

    public GuessNumber(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
    }

    public void start() {
        do {
            generateHiddenNumber();
            game();
        } while (checkCondition());
        arraysReset();
    }

    private void generateHiddenNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private void game() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        do {
            System.out.println("\nПодсказка, искомое число = " + hiddenNumber);
            if (player1.getAttemptNumber() < 11) {
                System.out.println("\nПервый игрок " + player1.getName() + " введите число");
                int number = sc.nextInt();
                player1.addNumber(number);
                player1.setAttemptNumber();
                if (player1.getNumber() < hiddenNumber) {
                    System.out.println("\nЧисло " + player1.getNumber() + " меньше загаданного компьютером");
                } else if (player1.getNumber() > hiddenNumber) {
                    System.out.println("\nЧисло " + player1.getNumber() + " больше загаданного компьютером");
                } else {
                    System.out.println("\nИгрок " + player1.getName() + " угадал число " + player1.getNumber() + " с " +
                            player1.getAttemptNumber() + " попытки");
                    break;
                }
                if (player1.getAttemptNumber() > 10) {
                    System.out.println("У " + player1.getName() + " закончились попытки");
                }
            }
                
            if (player2.getAttemptNumber() < 11) {
                System.out.println("\nВторой игрок " + player2.getName() + " введите число");
                int number = sc.nextInt();
                player2.addNumber(number);
                player2.setAttemptNumber();
                if (player2.getNumber() < hiddenNumber) {
                    System.out.println("\nЧисло " + player2.getNumber() + " меньше загаданного компьютером");
                } else if (player2.getNumber() > hiddenNumber) {
                    System.out.println("\nЧисло " + player2.getNumber() + " больше загаданного компьютером");
                } else {
                    System.out.println("\nИгрок " + player2.getName() + " угадал число " + player2.getNumber() + " с " +
                            player1.getAttemptNumber() + " попытки");
                    break;
                }
                if (player2.getAttemptNumber() > 10) {
                    System.out.println("У " + player2.getName() + " закончились попытки");
                }
            }
        } while (player1.getAttemptNumber() < 11 || player2.getAttemptNumber() < 11);
        showPlayerNumbers();
    }

    private boolean checkCondition() {
        if (player1.getNumber() != hiddenNumber && player2.getNumber() != hiddenNumber && (player1.getAttemptNumber() < 11 ||
                player2.getAttemptNumber() < 11)); {
        }
        return false;
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
}
