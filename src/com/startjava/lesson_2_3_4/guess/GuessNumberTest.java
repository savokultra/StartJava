package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[] = new String[3];
        int nameCell = 0;

        do {
            System.out.println("Введите имя игрока: ");
            names[nameCell++] = sc.nextLine();
        } while (nameCell < 3);

        GuessNumber game = new GuessNumber(names);

        System.out.println("Введите имя первого игрока: ");
        String name1 = sc.nextLine();

        System.out.println("\nВведите имя второго игрока: ");
        String name2 = sc.nextLine();

        //GuessNumber game = new GuessNumber(name1, name2);
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
