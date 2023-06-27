import java.util.Scanner;

public class GuessNumber {
    private String playerName;
    private String player1Name;
    private int playerNumber;
    private int player1Number;
    private boolean cycle;
    private int hideNumber = 1; //+ (int) (Math.random() * 100);

    public GuessNumber() {
    }

    public GuessNumber(boolean cycle) {
        this.cycle = cycle;
    }

    public GuessNumber(String playerName, String player1Name) {
        this.playerName = playerName;
        this.player1Name = player1Name;
    }

    public GuessNumber(int playerNumber, int player1Number) {
        this.playerNumber = playerNumber;
        this.player1Number = player1Number;
    }

    public void showHideNumber() {
        System.out.println("hideNumber = " + hideNumber);
    }
    
    public boolean playGame() {
        if (hideNumber != playerNumber && hideNumber != player1Number) {
            System.out.println("Не один не угадал");
        }
        return false;
    }

    public int getHideNumber() {
        return hideNumber;
    }
}
