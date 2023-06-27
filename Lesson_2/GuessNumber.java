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
    
    public static void playerInsert() { 
        System.out.println("Введите имя игрока: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Player player = new Player(name);
        System.out.println("имя игрока: " + player.getName());
        System.out.println("Введите имя второго игрока: ");
        String name1 = sc.nextLine();
        Player player1 = new Player(name1);
        System.out.println("имя игрока 2: " + player1.getName());
        System.out.println("Игрок " + player.getName() + " введите число");
        int number = sc.nextInt();
        player.setNumber(number);
        System.out.println("Игрок " + player.getName() + " ввёл число " + player.getNumber());
    }

    public int getHideNumber() {
        return hideNumber;
    }
}
