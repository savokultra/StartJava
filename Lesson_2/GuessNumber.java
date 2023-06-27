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
        //System.out.println("player1Number = " + player1Number);
    }
    
    /*public static void playerInsert() { 
        Player player = new Player();
        System.out.println("Игрок " + player.getName() + " введите число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        player.setNumber(number);
        GuessNumber playerNumber = new GuessNumber(player.getNumber());
        System.out.println("Игрок " + player.getName() + " ввёл число " + player.getNumber());
        
        Player player1 = new Player();
        System.out.println("Игрок 1 " + player1.getName() + " введите число"); 
        int number1 = sc.nextInt();
        player1.setNumber(number1);
        GuessNumber player1Number = new GuessNumber(number1);
        System.out.println("Игрок 1 " + player1.getName() + " ввёл число " + player1.getNumber());
    }*/

    public int getHideNumber() {
        return hideNumber;
    }
}
