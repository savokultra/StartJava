package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private static final int QUANTITY_PLAYERS = 3;
    private static final int QUANTITY_ROUNDS = 3;
    private final Player[] players = new Player[QUANTITY_PLAYERS];
    private int hiddenNumber;

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
        Random r = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int random = r.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[random];
            players[random] = temp;
        }
        System.out.println("\nЖребий брошен, игроки ходят в следующем порядке: ");
        for(int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + "м угадывает - " + players[i].getName());
        }
    }

    private void startGameplay() {
        for (int i = 1; i <= QUANTITY_ROUNDS; i++) {
            generateHiddenNumber();
            System.out.println("\n\n" + i + "й Раунд! У каждого игрока по 10 попыток.");
            boolean isWin = false;
            while (!isWin) {
                System.out.println("\nПодсказка, искомое число = " + hiddenNumber);
                for (Player players : players) {
                    if (isGuessed(players)) {
                        isWin = true;
                        break;
                    }
                }
            }
            showPlayerNumbers();
            clear();
        }
        showWins();
        clearWins();
    }

    private void generateHiddenNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private boolean isGuessed(Player player) {
        Scanner sc = new Scanner(System.in);
        inputNumber(player, sc);
        int playerNumber = player.getNumber();
        if (playerNumber == hiddenNumber) {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + playerNumber + " с " +
                    player.getAttempt() + " попытки");
            player.upScore();
            return true;
        }
        System.out.println("\nЧисло " + (playerNumber < hiddenNumber ? playerNumber +
                " меньше" : playerNumber + " больше") + " загаданного компьютером");
        return hasAttempt(player);
    }

    private void inputNumber(Player player, Scanner sc) {
        sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("\nИгрок " + player.getName() + " введите число от 1 до 100: ");
            number = sc.nextInt();
        } while (player.addNumber(number));
    }

    private boolean hasAttempt(Player player) {
        if (player.getAttempt() >= Player.getATTEMPTS()) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return players[2].getAttempt() == Player.getATTEMPTS();
        }
        return false;
    }

    private void showPlayerNumbers() {
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
            System.out.println("Игрок " + player.getName() + " угадал загаданное число " + player.getScore() +
                    (player.getScore() > 1 ? " раза" : " раз"));
        }
    }

    private void clear() {
        for (Player player : players) {
            player.clear();
        }
    }

    private void clearWins() {
        for (Player player : players) {
            player.clearScore();
        }
    }
}
