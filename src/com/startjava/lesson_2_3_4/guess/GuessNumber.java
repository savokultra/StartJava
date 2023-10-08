package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player;
    private Player player1;
    Scanner sc = new Scanner(System.in);
    private int hideNumber;
    private int attempt = 1;

    public GuessNumber(String player, String player1) {
        this.player = new Player(player);
        this.player1 = new Player(player1);
    }

    public void start() {
        do {
            generateHiddenNumber();
            System.out.println("Игра началась! У каждого игрока по 10 попыток.");
            do {
                System.out.println("\nПодсказка, искомое число = " + hideNumber);
                if (attempt > 10) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                    break;
                }
                System.out.println("\nПервый игрок " + player.getName() + " введите число");
                player.setAttempt(attempt - 1);
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

                if (attempt > 10) {
                    System.out.println("У " + player1.getName() + " закончились попытки");
                    break;
                }
                System.out.println("\nВторой игрок " + player1.getName() + " введите число");
                player1.setAttempt(attempt - 1);
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
        } while (player.getNumber() != hideNumber && player1.getNumber() != hideNumber && attempt < 11);
    }

    private void generateHiddenNumber() {
        hideNumber = 1 + (int) (Math.random() * 100);
    }
}
