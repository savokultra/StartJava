package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer;
        System.out.println("Введите имя первого игрока: ");
        Scanner sc = new Scanner(System.in);
        String player = sc.nextLine();

        System.out.println("\nВведите имя второго игрока: ");
        String player1 = sc.nextLine();
        GuessNumber players = new GuessNumber(player, player1);

        do {
            players.start();
            do {
                System.out.println("\nХотите продолжить игру [yes/no]:");
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
            players.arraysFill();
        } while (answer.equals("yes"));
    }
}