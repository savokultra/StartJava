package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите имя " + (i + 1) + " игрока: ");
            names[i] = sc.nextLine();
        }

        GuessNumber game = new GuessNumber(names);
        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру [yes/no]:");
            answer = sc.nextLine();
        } while (!answer.equals("no"));
    }
}