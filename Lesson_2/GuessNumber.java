import java.util.Scanner;

public class GuessNumber {
    private String playerName;
    private String player1Name;
    private String answer;
    private int playerNumber;
    private int player1Number;
    private int hideNumber;
    
    Scanner sc = new Scanner(System.in);

    public GuessNumber(String playerName, String player1Name) {
        this.playerName = playerName;
        this.player1Name = player1Name;
    }

    public void startHideNumber() {
        hideNumber = 1 + (int) (Math.random() * 100);
    }

    public void insertPlayerNumber() {
        do {
            startHideNumber();
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
                }
                if (playerNumber == hideNumber) {
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
                    System.out.println("\nВы победили!\nЧисло " + playerNumber + " совпадает с" +
                            " загаданным");
                }
            } while (playerNumber != hideNumber && player1Number != hideNumber);
            do {
                System.out.println("\nХотите продолжить игру [yes/no]:");
                sc.nextLine();
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
