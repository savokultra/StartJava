import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcTest = new Calculator();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int number = scanner.nextInt();
            System.out.println("Введите знак математической операции: + - * / ^ ");
            char sign = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int number1 = scanner.nextInt();
            calcTest.setNumber(number);
            calcTest.setNumber1(number1);
            calcTest.setSign(sign);
            calcTest.switchMethod();
            //не работает с String
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            String string = scanner.nextLine();
            calcTest.setString(string);
            //но работает с int
            System.out.println("Хотите продолжить вычисления? [yes 1 /no 2 ]:");
            int start = scanner.nextInt();
            calcTest.setStart(start);
        } while (calcTest.getStart() == 1);
    }
}
