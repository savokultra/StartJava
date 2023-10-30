package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber;
    private boolean condition;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        do {
            generateHiddenNumber();
            startGameplay();
        } while (!condition);
        clear();
        condition = false;
    }

    private void generateHiddenNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private void startGameplay() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        do {
            System.out.println("\nПодсказка, искомое число = " + hiddenNumber);
            selectWinner(player1);
            if (condition) {
                break;
            }
            selectWinner(player2);
        } while (!condition);
        showPlayerNumbers(player1, player1.getAllNumbers());
        showPlayerNumbers(player2, player2.getAllNumbers());
    }

    private void showPlayerNumbers(Player player, int[] numbers) {
        System.out.print("\nИгрок " + player.getName() + " загадал числа: ");
        for (int element : numbers) {
            System.out.printf("%s ", element);
        }
    }
    
    private void clear() {
        player1.clear();
        player2.clear();
    }
    
    private boolean selectWinner(Player player) {
        Scanner sc = new Scanner(System.in);
        int number;
        if (player.getAttemptNumber() < 10) {
            do {
                System.out.print("\nИгрок " + player.getName() + " введите число от 1 до 100: ");
                number = sc.nextInt();
                if (number < 1 || number > 100) {
                    System.out.print("\nВведенное число " + number + " не в диапазоне от 1 до 100");
                }
            } while (number < 1 || number > 100);
            player.addNumber(number);
            if (player.getNumber() < hiddenNumber) {
                System.out.println("\nЧисло " + player.getNumber() + " меньше загаданного компьютером");
            } else if (player.getNumber() > hiddenNumber) {
                System.out.println("\nЧисло " + player.getNumber() + " больше загаданного компьютером");
            } else {
                System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " с " +
                        player.getAttemptNumber() + " попытки");
                condition = true;
            }
            if (player.getAttemptNumber() > 9) {
                System.out.println("У " + player.getName() + " закончились попытки");
                if (player2.getAttemptNumber() > 9) {
                    condition = true;
                }
            }
        }
        return condition;
    }
}
