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

        do {
            System.out.println("Первый игрок " + player.getName() + " введите число");
            players.insertPlayerNumber();
            if (players.getPlayerNumber() != players.getHideNumber()) {
                System.out.println("Второй игрок " + player1.getName() + " введите число");
                players.insertPlayer1Number();
            }
        } while (players.getPlayerNumber() != players.getHideNumber() && players.getPlayer1Number() != players.getHideNumber());

        players.showHideNumber();
    }
}
