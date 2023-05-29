import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        String string = scanner.nextLine();
        System.out.println("string: " + string);
    }
}
