import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer;
        System.out.println("Введите имя первого игрока: ");
        Scanner sc = new Scanner(System.in);
        Player player = new Player(sc.nextLine());

        System.out.println("\nВведите имя второго игрока: ");
        Player player1 = new Player(sc.nextLine());

        GuessNumber players = new GuessNumber(player.getPlayer(), player1.getPlayer());
        
        do {
            players.start();
            do {
                System.out.println("\nХотите продолжить игру [yes/no]:");
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
