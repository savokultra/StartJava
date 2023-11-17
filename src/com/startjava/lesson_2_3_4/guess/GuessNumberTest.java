package com.startjava.lesson_2_3_4.guess;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class GuessNumberTest {
final static String[] NAMES = new String[3];
final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber(inputNames());
        gameContinue(game);
    }

    private static String[] inputNames() {
        for (int i = 0; i < GuessNumberTest.NAMES.length; i++) {
            System.out.println("Введите имя " + (i + 1) + " игрока: ");
            GuessNumberTest.NAMES[i] = SC.nextLine();
        }
        return NAMES;
    }

    private static void gameContinue(GuessNumber game) {
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру [yes/no]:");
            answer = SC.nextLine();
        } while (!answer.equals("no"));
    }
}