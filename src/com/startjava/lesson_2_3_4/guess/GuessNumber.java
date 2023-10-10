package com.startjava.lesson_2_3_4.guess;

public class GuessNumber {
    private Player player;
    private Player player1;
    Scanner sc = new Scanner(System.in);
    private int hideNumber;
    private int playerAttempt = 1;
    private int player1Attempt = 1;

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
                if (playerAttempt < 3) {
                    System.out.println("\nПервый игрок " + player.getName() + " введите число");
                    player.setAttempt(playerAttempt - 1);
                    playerAttempt++;
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
                    if (playerAttempt > 2) {
                        System.out.println("У " + player.getName() + " закончились попытки");
                    }
                }
                
                if (player1Attempt < 3) {
                    System.out.println("\nВторой игрок " + player1.getName() + " введите число");
                    player1.setAttempt(player1Attempt - 1);
                    player1Attempt++;
                    int number = sc.nextInt();
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
                    if (player1Attempt > 2) {
                        System.out.println("У " + player1.getName() + " закончились попытки");
                    }
                }
                
                if (playerAttempt > 2 || player1Attempt > 2) {
                    break;
                }
            } while (playerAttempt < 3 || player1Attempt < 3);
        } while ((player.getNumber() != hideNumber && player1.getNumber() != hideNumber) && (playerAttempt < 3 || player1Attempt < 3));
    }

    private void generateHiddenNumber() {
        hideNumber = 1 + (int) (Math.random() * 100);
    }
}
