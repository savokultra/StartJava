import java.util.Scanner;

public class GuessNumber {
    private String playerName;
    private String player1Name;
    private int playerNumber;
    private int player1Number;
    private int hideNumber;
    Scanner sc = new Scanner(System.in);

    public GuessNumber(String playerName, String player1Name) {
        this.playerName = playerName;
        this.player1Name = player1Name;
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

    public void startHideNumber() {
        hideNumber = 1 + (int) (Math.random() * 100);
    }

    public void insertPlayerNumber() {
        startHideNumber();
        System.out.println("\nПодсказка, искомое число = " + hideNumber);
        System.out.println("\nПервый игрок " + playerName + " введите число");
        int number = sc.nextInt();
        this.playerNumber = number;
        if (this.playerNumber < hideNumber) {
            System.out.println("\nЧисло " + this.playerNumber + " меньше загаданного компьютером");
        } else if (this.playerNumber > hideNumber) {
            System.out.println("\nЧисло " + this.playerNumber + " больше загаданного компьютером");
        /*} else if (playerNumber != hideNumber) {
            insertPlayer1Number();*/
        } else {
            System.out.println("\nВы угадали!\nЧисло " + this.playerNumber + " совпадает с" +
                    "загаданным");
        }
    }
    
    public void insertPlayer1Number() {
        System.out.println("\nВторой игрок " + player1Name + " введите число");
        int number1 = sc.nextInt();
        this.player1Number = number1;
        if (this.player1Number < hideNumber) {
            System.out.println("\nЧисло " + this.player1Number + " меньше загаданного компьютером");
        } else if (this.player1Number > hideNumber) {
            System.out.println("\nЧисло " + this.player1Number + " больше загаданного компьютером");
        } else {
            System.out.println("\nВы победили!\nЧисло " + this.playerNumber + " совпадает с" +
                    "загаданным");
        }
    }
}
