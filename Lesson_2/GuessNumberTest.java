import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Введите имя первого игрока: ");
        Scanner sc = new Scanner(System.in);
        Player player = new Player(sc.nextLine());

        System.out.println("\nВведите имя второго игрока: ");
        Player player1 = new Player(sc.nextLine());

        GuessNumber players = new GuessNumber(player.getName(), player1.getName());

        players.showPlayer();

        players.insertPlayerNumber();
    }
}
