import java.util.Scanner;

public class GuessNumber {
    private int playerNumber;
    private int player1Number;
    private int hideNumber = 1 + (int) (Math.random() * 100);

    public GuessNumber() {
    }

    public GuessNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void showHideNumber() {
        System.out.println("hideNumber = " + hideNumber);
    }

    public void showPlayersNumbers() {
        System.out.println("playerNumber = " + playerNumber);
    }

    public static void play() { 
    System.out.print("Введите загаданное число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Player player = new Player(number);
    }

    public int getHideNumber() {
        return hideNumber;
    }
}