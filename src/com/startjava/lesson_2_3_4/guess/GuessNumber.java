package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player;
    private Player player1;
    private int hideNumber;
    private int playerAttempt;
    private int player1Attempt;
    Scanner sc = new Scanner(System.in);
    

    public GuessNumber(String player, String player1) {
        this.player = new Player(player);
        this.player1 = new Player(player1);
    }

    public void start() {
        do {
            generateHiddenNumber();
            System.out.println("Игра началась! У каждого игрока по 10 попыток.");
            game();
        } while (player.getNumber() != hideNumber && player1.getNumber() != hideNumber && (playerAttempt < 10 || player1Attempt < 10));
        returnArray();
    }

    private void generateHiddenNumber() {
        hideNumber = 1 + (int) (Math.random() * 100);
    }
    
    private void game() {
        playerAttempt = 0;
        player1Attempt = 0;
        do {
            System.out.println("\nПодсказка, искомое число = " + hideNumber);
            if (playerAttempt < 10) {
                System.out.println("\nПервый игрок " + player.getName() + " введите число");
                player.setAttempt(playerAttempt);
                playerAttempt++;
                int number = sc.nextInt();
                player.setNumber(number);
                if (player.getNumber() < hideNumber) {
                    System.out.println("\nЧисло " + player.getNumber() + " меньше загаданного компьютером");
                } else if (player.getNumber() > hideNumber) {
                    System.out.println("\nЧисло " + player.getNumber() + " больше загаданного компьютером");
                } else {
                    System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " с " + playerAttempt + " попытки");
                    break;
                }
                if (playerAttempt > 9) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                }
            }
                
            if (player1Attempt < 10) {
                System.out.println("\nВторой игрок " + player1.getName() + " введите число");
                player1.setAttempt(player1Attempt);
                player1Attempt++;
                int number = sc.nextInt();
                player1.setNumber(number);
                if (player1.getNumber() < hideNumber) {
                    System.out.println("\nЧисло " + player1.getNumber() + " меньше загаданного компьютером");
                } else if (player1.getNumber() > hideNumber) {
                    System.out.println("\nЧисло " + player1.getNumber() + " больше загаданного компьютером");
                } else {
                    System.out.println("\nИгрок " + player1.getName() + " угадал число " + player1.getNumber() + " с " + player1Attempt + " попытки");
                    break;
                }
                if (player1Attempt > 9) {
                    System.out.println("У " + player1.getName() + " закончились попытки");
                }
            }
        } while (playerAttempt < 10 || player1Attempt < 10);
    }

    private void returnArray() {
        int arrayCopy[] = new int[10];
        System.out.print("\nplayer назвал числа ");
        for (int i = 0; i < arrayCopy.length; i++) {
            player.setAttempt(i);
            arrayCopy[i] = player.getNumber();
            if (arrayCopy[i] != 0) {
                System.out.printf("%d ", arrayCopy[i]);
            }
        }
        int array1Copy[] = new int[10];
        System.out.print("\nplayer1 назвал числа ");
        for (int i = 0; i < array1Copy.length; i++) {
            player1.setAttempt(i);
            array1Copy[i] = player1.getNumber();
            if (array1Copy[i] != 0) {
                System.out.printf("%d ", array1Copy[i]);
            }
        }
    }
}