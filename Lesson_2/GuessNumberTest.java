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
        System.out.println("имя игрока 2: " + player1.getName());
        GuessNumber playerNumber = new GuessNumber(player.getNumber());
        playerNumber.showPlayersNumbers();
        playerNumber.showHideNumber();
    }
}