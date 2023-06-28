import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        System.out.println("Введите имя первого игрока: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Player player = new Player(name);
        System.out.println("Имя первого игрока: " + player.getName());
        
        System.out.println("Введите имя второго игрока: ");
        String name1 = sc.nextLine();
        Player player1 = new Player(name1);
        System.out.println("Имя второго игрока: " + player1.getName());

        GuessNumber players = new GuessNumber(player.getName(), player1.getName());
        
        System.out.println("Первый игрок " + player.getName() + " введите число");
        players.insertPlayerNumber();
        System.out.println("Второй игрок " + player1.getName() + " введите число");
        players.insertPlayer1Number();
        
        //System.out.println("playerNumber.getNumber() = " + playerNumber.getNumber());
        //System.out.println("playerNumbers " + playerNumbers.getPlayerNumber() + " " + playerNumbers.getPlayer1Number());

        /*System.out.println("Первый игрок " + player.getName() + " введите число");
        int number = sc.nextInt();
        player.setNumber(number);
        System.out.println("Первый игрок " + player.getName() + " ввёл число " + player.getNumber());

        System.out.println("Второй игрок " + player1.getName() + " введите число");
        int number1 = sc.nextInt();
        player1.setNumber(number1);
        System.out.println("Второй игрок " + player1.getName() + " ввёл число " + player1.getNumber());

        GuessNumber bets = new GuessNumber(player.getNumber(), player1.getNumber());
        
        System.out.println("bets.playerNumber " + bets.getPlayerNumber());*/
        //cycle.showHideNumber();
    }
}
