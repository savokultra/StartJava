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

        do {
            do {
                players.insertPlayerNumber();
                if (players.getPlayerNumber() == players.getHideNumber()) {
                break;
            }
                players.insertPlayer1Number();
            } while (players.getPlayerNumber() != players.getHideNumber() && 
                    players.getPlayer1Number() != players.getHideNumber());
            do {
                System.out.println("\nХотите продолжить игру [yes/no]:");
                agree = sc.nextLine();
            } while (!agree.equals("yes") && !agree.equals("no"));
            
        } while (agree.equals("yes"));
    }
}
