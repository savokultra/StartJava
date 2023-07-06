import java.util.Scanner;

public class GuessNumber {
    Player player;
    Player player1;
    Scanner sc = new Scanner(System.in);
    private int hideNumber;

    public GuessNumber(Player player, Player player1) {
        this.player = player;
        this.player1 = player1;
    }

    public void start() {
        do {
            generateHiddenNumber();
            do {
                System.out.println("\nПодсказка, искомое число = " + hideNumber);
                System.out.println("\nПервый игрок " + player.getName() + " введите число");
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
            } while (true);
        } while (player.getNumber() != hideNumber && player1.getNumber() != hideNumber);
    }

    private void generateHiddenNumber() {
        hideNumber = 1 + (int) (Math.random() * 100);
    }
}
