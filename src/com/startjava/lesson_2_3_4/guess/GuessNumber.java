package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player[] players = new Player[3];
    private int hiddenNumber;
    private Scanner sc = new Scanner(System.in);

    public GuessNumber(String[] names) {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void start() {
        generateHiddenNumber();
        startGameplay();
        clear();
    }

    private void generateHiddenNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private void startGameplay() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        boolean b = true;
        while (b) {
            System.out.println("\nПодсказка, искомое число = " + hiddenNumber);
            for (Player x : players) {
                if (isGuessed(x)) {
                    b = false;
                    break;
                }
            }
        }
        showPlayerNumbers(players);
    }

    private boolean isGuessed(Player player) {
        if (player.getAttempt() < 10) {
            inputNumber(player);
            if (player.getNumber() == hiddenNumber) {
                System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " с " +
                        player.getAttempt() + " попытки");
                return true;
            }
            System.out.println("\nЧисло " + (player.getNumber() < hiddenNumber ? player.getNumber() +
                    " меньше" : player.getNumber() + " больше") + " загаданного компьютером");
            if (player.getAttempt() > 9) {
                System.out.println("У " + player.getName() + " закончились попытки");
                if (players[2].getAttempt() > 9) {
                    return true;
                }
            }
        }
        return false;
    }

    private void inputNumber(Player player) {
        int number;
        do {
            System.out.print("\nИгрок " + player.getName() + " введите число от 1 до 100: ");
            number = sc.nextInt();
        } while (player.addNumber(number));
    }

    private void showPlayerNumbers(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("\nИгрок " + players[i].getName() + " загадал числа: ");
            int[] numbers = players[i].getAllNumbers();
            for (int number : numbers) {
                System.out.printf("%s ", number);
            }
        }
    }

    private void clear() {
        for (int i = 0; i < players.length; i++) {
            players[i].clear();
        }
    }
}
