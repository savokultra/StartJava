package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String[] names = new String[3];

        insertNames(names);
        GuessNumber game = new GuessNumber(names);
        gameContinue("yes", game);
    }

    private static void insertNames(String[] names) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите имя " + (i + 1) + " игрока: ");
            names[i] = sc.nextLine();
        }
    }

    private static void gameContinue(String answer, GuessNumber game) {
        Scanner sc = new Scanner(System.in);
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру [yes/no]:");
            answer = sc.nextLine();
        } while (!answer.equals("no"));
    }
}