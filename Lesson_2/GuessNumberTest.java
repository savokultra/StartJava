import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        System.out.println("Введите имя игрока: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Player player = new Player(name);
        System.out.println("имя игрока: " + player.getName());
        
        System.out.println("Введите имя второго игрока: ");
        String name1 = sc.nextLine();
        Player player1 = new Player(name1);
        System.out.println("имя второго игрока:: " + player1.getName());
        
        System.out.println("Игрок " + player.getName() + " введите число");
        int number = sc.nextInt();
        player.setNumber(number);
        //GuessNumber playerNumber = new GuessNumber(player.getNumber());
        System.out.println("Игрок " + player.getName() + " ввёл число " + player.getNumber());
        
        System.out.println("Игрок1 " + player1.getName() + " введите число");
        sc.nextLine();
        number = sc.nextInt();
        player1.setNumber(number);
        System.out.println("Игрок 1 " + player1.getName() + " ввёл число " + player1.getNumber());
        GuessNumber bets = new GuessNumber(player.getNumber(), player1.getNumber());

        bets.showHideNumber();
    }
}
