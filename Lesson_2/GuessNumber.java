import java.util.Scanner;

public class GuessNumber {
    private String playerName;
    private String player1Name;
    private int playerNumber;
    private int player1Number;
    private int hideNumber = 1 + (int) (Math.random() * 100);

    public GuessNumber() {
    }

    public GuessNumber(String playerName, String player1Name) {
        this.playerName = playerName;
        this.player1Name = player1Name;
    }

    public GuessNumber(int playerNumber, int player1Number) {
        this.playerNumber = playerNumber;
        this.player1Number = player1Number;
    }
    
    public int getPlayerNumber() {
        return playerNumber;
    }
    
    public int getPlayer1Number() {
        return player1Number;
    }
    
    public int getHideNumber() {
        return hideNumber;
    }
    
    public String getPlayerName() {
        return playerName;
    }
    
    public String getPlayer1Name() {
        return player1Name;
    }
    
    public void insertPlayerNumber() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Player playerNumber = new Player();
        playerNumber.setNumber(number);
        this.playerNumber = number;
        if (this.playerNumber < hideNumber) {
            System.out.println("Число N меньше того, что загадал компьютер");
        } else if (this.playerNumber > hideNumber) {
            System.out.println("Число N больше того, что загадал компьютер");
        }
        System.out.println("playerNumber.getNumber() = " + playerNumber.getNumber());
        System.out.println("playerName = " + playerName);
        System.out.println("playerNumber = " + this.playerNumber);
        System.out.println("getHideNumber() = " + getHideNumber());
    }
    
    public void insertPlayer1Number() {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        Player player1Number = new Player();
        player1Number.setNumber(number1);
        this.player1Number = number1;
        if (this.player1Number < hideNumber) {
            System.out.println("Число N меньше того, что загадал компьютер");
        } else if (this.player1Number > hideNumber) {
            System.out.println("Число N больше того, что загадал компьютер");
        }
        System.out.println("player1Number.getNumber() = " + player1Number.getNumber());
        System.out.println("player1Name = " + player1Name);
        System.out.println("player1Number = " + this.player1Number);
        System.out.println("getHideNumber() = " + getHideNumber());
    }
    
    public void showHideNumber() {
        System.out.println("hideNumber = " + hideNumber);
    }
}
