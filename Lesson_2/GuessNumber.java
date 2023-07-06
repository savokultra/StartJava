import java.util.Scanner;

public class GuessNumber {
    private String playerName;
    private String player1Name;
    private int playerNumber;
    private int player1Number;
    private int hideNumber;

    Player player;

    Scanner sc = new Scanner(System.in);

    public GuessNumber(String playerName, String player1Name) {
        this.playerName = playerName;
        this.player1Name = player1Name;
    }

    public void start() {
        do {
            generateHiddenNumber();
            do {
                System.out.println("\nПодсказка, искомое число = " + hideNumber);
                System.out.println("\nПервый игрок " + playerName + " введите число");
                int number = sc.nextInt();
                playerNumber = number;
                if (playerNumber < hideNumber) {
                    System.out.println("\nЧисло " + playerNumber + " меньше загаданного компьютером");
                } else if (playerNumber > hideNumber) {
                    System.out.println("\nЧисло " + playerNumber + " больше загаданного компьютером");
                } else {
                    System.out.println("\nВы угадали!\nЧисло " + playerNumber + " совпадает с" +
                            " загаданным");
                    break;
                }

                System.out.println("\nВторой игрок " + player1Name + " введите число");
                int number1 = sc.nextInt();
                player1Number = number1;
                if (player1Number < hideNumber) {
                    System.out.println("\nЧисло " + player1Number + " меньше загаданного компьютером");
                } else if (player1Number > hideNumber) {
                    System.out.println("\nЧисло " + player1Number + " больше загаданного компьютером");
                } else {
                    System.out.println("\nВы победили!\nЧисло " + player1Number + " совпадает с" +
                            " загаданным");
                    break;
                }
            } while (true);
        } while (playerNumber != hideNumber && player1Number != hideNumber);
    }

    private void generateHiddenNumber() {
        hideNumber = 1 + (int) (Math.random() * 100);
    }
}
