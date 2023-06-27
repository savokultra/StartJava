import java.util.Scanner;

public class GuessNumber {
    private int playerNumber;
    private int player1Number;
    private int hideNumber = 1 + (int) (Math.random() * 100);

    public GuessNumber() {
    }

    public GuessNumber(int playerNumber, int player1Number) {
        this.playerNumber = playerNumber;
        this.player1Number = player1Number;
    }

    /*public GuessNumber(int playerNumber,int player1Number) {
        this.playerNumber = playerNumber;
        this.player1Number = player1Number;
    }*/

    public void showHideNumber() {
        System.out.println("hideNumber = " + hideNumber);
    }
    
    public void playGame() {
        
    }

    public int getHideNumber() {
        return hideNumber;
    }
}
