package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
private static final int PLAYERS_QUANTITY = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessNumber game = new GuessNumber(inputNames());
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру [yes/no]:");
            answer = sc.nextLine();
        } while (!answer.equals("no"));
    }

    private static String[] inputNames() {
        String[] NAMES = new String[PLAYERS_QUANTITY];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < NAMES.length; i++) {
            System.out.println("Введите имя " + (i + 1) + " игрока: ");
            NAMES[i] = sc.nextLine();
        }
        return NAMES;
    }
}