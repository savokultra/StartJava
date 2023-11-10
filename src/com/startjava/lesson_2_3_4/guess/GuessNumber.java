package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        do {
            generateHiddenNumber();
        } while (!startGameplay());
        clear();
    }

    private void generateHiddenNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private boolean startGameplay() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        do {
            System.out.println("\nПодсказка, искомое число = " + hiddenNumber);
            if (isGuessed(player1)) {
                break;
            }
        } while (!isGuessed(player2));
        showPlayerNumbers(player1);
        showPlayerNumbers(player2);
        return true;
    }
    
    private boolean isGuessed(Player player) {
        if (player.getAttemptNumber() < 10) {
            player.addNumber(inputNumber(player));
            if (player.getNumber() < hiddenNumber) {
                System.out.println("\nЧисло " + player.getNumber() + " меньше загаданного компьютером");
            } else if (player.getNumber() > hiddenNumber) {
                System.out.println("\nЧисло " + player.getNumber() + " больше загаданного компьютером");
            } else  {
                System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " с " +
                        player.getAttemptNumber() + " попытки");
                return true;
            }
            if (player.getAttemptNumber() > 9) {
                System.out.println("У " + player.getName() + " закончились попытки");
                if (player2.getAttemptNumber() > 9) {
                    return true;
                }
            }
        }
        return false;
    }

    private int inputNumber(Player player) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("\nИгрок " + player.getName() + " введите число от 1 до 100: ");
            number = sc.nextInt();
            if (number < 1 || number > 100) {
                System.out.print("\nВведенное число " + number + " не в диапазоне от 1 до 100");
            }
        } while (number < 1 || number > 100);
        return number;
    }

    private void showPlayerNumbers(Player player) {
        System.out.print("\nИгрок " + player.getName() + " загадал числа: ");
        int[] numbers = player.getAllNumbers();
        for (int number : numbers) {
            System.out.printf("%s ", number);
        }
    }

    private void clear() {
        player1.clear();
        player2.clear();
    }
}
