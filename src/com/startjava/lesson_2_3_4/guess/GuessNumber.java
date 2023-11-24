package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private static final Player[] PLAYERS = new Player[3];
    private static final Scanner SC = new Scanner(System.in);
    private int hiddenNumber;

    public GuessNumber(String[] names) {
        for (int i = 0; i < PLAYERS.length; i++) {
            PLAYERS[i] = new Player(names[i]);
        }
    }

    public void start() {
        shufflePlayers();
        startGameplay();
    }

    private void shufflePlayers() {
        Random rand = new Random();
        for (int i = PLAYERS.length - 1; i > 0; i--) {
            int random = rand.nextInt(i + 1);
            Player temp = PLAYERS[i];
            PLAYERS[i] = PLAYERS[random];
            PLAYERS[random] = temp;
        }
        System.out.println("\nЖребий брошен, игроки ходят в следующем порядке: ");
        for(int i = 0; i <= PLAYERS.length - 1; i++) {
            System.out.println((i + 1) + "м угадывает - " + PLAYERS[i].getName());
        }
    }

    private void startGameplay() {
        for (int i = 1; i < 4; i++) {
            generateHiddenNumber();
            System.out.println("\n\n" + i + "й Раунд! У каждого игрока по 10 попыток.");
            boolean isWin = false;
            while (!isWin) {
                System.out.println("\nПодсказка, искомое число = " + hiddenNumber);
                for (Player players : PLAYERS) {
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
            inputNumber(player);
            int playerNumber = player.getNumber();
            if (playerNumber == hiddenNumber) {
                System.out.println("\nИгрок " + player.getName() + " угадал число " + playerNumber + " с " +
                        player.getAttempt() + " попытки");
                player.addScore();
                return true;
            }
            System.out.println("\nЧисло " + (playerNumber < hiddenNumber ? playerNumber +
                    " меньше" : playerNumber + " больше") + " загаданного компьютером");
            return checkAttempt(player);
    }

    private void inputNumber(Player player) {
        int number;
        do {
            System.out.print("\nИгрок " + player.getName() + " введите число от 1 до 100: ");
            number = SC.nextInt();
        } while (player.addNumber(number));
    }

    private boolean checkAttempt(Player player) {
        if (player.getAttempt() > 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return PLAYERS[2].getAttempt() > 9;
        }
        return false;
    }

    private void showPlayerNumbers() {
        for (Player player : GuessNumber.PLAYERS) {
            System.out.print("\nИгрок " + player.getName() + " загадал числа: ");
            int[] numbers = player.getAllNumbers();
            for (int number : numbers) {
                System.out.printf("%s ", number);
            }
        }
        System.out.println("\n");
    }

    private void showWins() {
        for (Player player : PLAYERS) {
            System.out.println("Игрок " + player.getName() + " угадал загаданное число " + player.getScore() +
                    (player.getScore() > 1 ? " раза" : " раз"));
        }
    }

    private void clear() {
        for (Player player : PLAYERS) {
            player.clear();
        }
    }

    private void clearWins() {
        for (Player player : PLAYERS) {
            player.clearScore();
        }
    }
}
