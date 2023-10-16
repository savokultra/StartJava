package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class GuessNumberTest {

    public static void main(String[] args) {
        
        System.out.println("Введите имя первого игрока: ");
        Scanner sc = new Scanner(System.in);
        String player = sc.nextLine();
        String answer = "";
        System.out.println("\nВведите имя второго игрока: ");
        String player1 = sc.nextLine();
        GuessNumber players = new GuessNumber(player, player1);

        do {
            answer = "";
            players.start();
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("\nХотите продолжить игру [yes/no]:");
                answer = sc.nextLine();
            }
            players.arraysFill();
        } while (answer.equals("yes"));
    }
}
