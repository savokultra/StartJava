import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Введите имя первого игрока: ");
        Scanner sc = new Scanner(System.in);
        Player player = new Player(sc.nextLine());

        System.out.println("\nВведите имя второго игрока: ");
        Player player1 = new Player(sc.nextLine());
        
        GuessNumber players1 = new GuessNumber(player, player1);

        players1.insertPlayerNumber();
        
        players1.showPlayer();
    }
}
