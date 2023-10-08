package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer;
        System.out.println("Введите имя первого игрока: ");
        Scanner sc = new Scanner(System.in);
        String player = sc.nextLine();
        //Player player = new Player(sc.nextLine());

        System.out.println("\nВведите имя второго игрока: ");
        String player1 = sc.nextLine();
        //Player player1 = new Player(sc.nextLine());
        GuessNumber players = new GuessNumber(player, player1);

        do {
            players.start();
            do {
                System.out.println("\nХотите продолжить игру [yes/no]:");
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}