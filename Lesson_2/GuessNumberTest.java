import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String agree;
        System.out.println("Введите имя первого игрока: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Player player = new Player(name);

        System.out.println("\nВведите имя второго игрока: ");
        String name1 = sc.nextLine();
        Player player1 = new Player(name1);

        GuessNumber players = new GuessNumber(player.getName(), player1.getName());
        
        players.insertPlayerNumber();
    }
}
