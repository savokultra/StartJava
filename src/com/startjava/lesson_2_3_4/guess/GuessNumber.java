package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    Player player;
    Player player1;
    Scanner sc = new Scanner(System.in);
    private int hideNumber;
    int attempt = 0;

    public GuessNumber(String player, String player1) {
        this.player = new Player(player);
        this.player1 = new Player(player1);
    }

    public void start() {
        do {
            generateHiddenNumber();
            do {
                System.out.println("\nПодсказка, искомое число = " + hideNumber);
                System.out.println("\nПервый игрок " + player.getName() + " введите число");
                player.setAttempt(attempt);
                int number = sc.nextInt();
                player.setNumber(number);
                if (player.getNumber() < hideNumber) {
                    System.out.println("\nЧисло " + player.getNumber() + " меньше загаданного компьютером");
                } else if (player.getNumber() > hideNumber) {
                    System.out.println("\nЧисло " + player.getNumber() + " больше загаданного компьютером");
                } else {
                    System.out.println("\nВы угадали!\nЧисло " + player.getNumber() + " совпадает с" +
                            " загаданным");
                    break;
                }

                System.out.println("\nВторой игрок " + player1.getName() + " введите число");
                player1.setAttempt(attempt);
                number = sc.nextInt();
                player1.setNumber(number);
                if (player1.getNumber() < hideNumber) {
                    System.out.println("\nЧисло " + player1.getNumber() + " меньше загаданного компьютером");
                } else if (player1.getNumber() > hideNumber) {
                    System.out.println("\nЧисло " + player1.getNumber() + " больше загаданного компьютером");
                } else {
                    System.out.println("\nВы победили!\nЧисло " + player1.getNumber() + " совпадает с" +
                            " загаданным");
                    break;
                }
                attempt++;
            } while (true);
        } while (player.getNumber() != hideNumber && player1.getNumber() != hideNumber);
    }

    private void generateHiddenNumber() {
        hideNumber = 1 + (int) (Math.random() * 100);
    }
}
