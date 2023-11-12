package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

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
        shufflePlayers();
        startGameplay();
    }

    private void shufflePlayers() {
        Random rand = new Random();
        Player temp;
        for (int i = players.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
        System.out.println("\nЖребий брошен, игроки ходят в следующем порядке: ");
        for(int i = 0; i <= players.length - 1; i++) {
            System.out.println((i + 1) + "м угадывает - " + players[i].getName());
        }
    }

    private void startGameplay() {
        for (int i = 1; i < 4; i++) {
            generateHiddenNumber();
            System.out.println("\n\n" + i + "й Раунд! У каждого игрока по 10 попыток.");
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
        showWins();
        clear();
    }

    private void generateHiddenNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private boolean isGuessed(Player player) {
        if (player.getAttempt() < 10) {
            inputNumber(player);
            if (player.getNumber() == hiddenNumber) {
                System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " с " +
                        player.getAttempt() + " попытки");
                player.addWin();
                return true;
            }
            System.out.println("\nЧисло " + (player.getNumber() < hiddenNumber ? player.getNumber() +
                    " меньше" : player.getNumber() + " больше") + " загаданного компьютером");
            return checkAttempt(player);
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

    private boolean checkAttempt(Player player) {
        if (player.getAttempt() > 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return players[2].getAttempt() > 9;
        }
        return false;
    }

    private void showPlayerNumbers(Player[] players) {
        for (Player player : players) {
            System.out.print("\nИгрок " + player.getName() + " загадал числа: ");
            int[] numbers = player.getAllNumbers();
            for (int number : numbers) {
                System.out.printf("%s ", number);
            }
        }
        System.out.println("\n");
    }

    private void showWins() {
        for (Player player : players) {
            System.out.println("Игрок " + player.getName() + " угадал загаданное число " + player.getWins() +
                    (player.getWins() > 1 ? " раза" : " раз"));
        }
    }

    private void clear() {
        for (Player player : players) {
            player.clear();
        }
    }
}
