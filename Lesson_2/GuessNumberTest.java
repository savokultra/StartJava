import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Введите имя игрока: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Player player1 = new Player(name);
        System.out.println("имя игрока: " + player1.getName());
    }
}