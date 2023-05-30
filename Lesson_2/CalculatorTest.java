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
            calcTest.switchCalc();
            do {
                calcTest.scannerString();
            } while (calcTest.checkNextStep() == 3);
        } while (calcTest.checkNextStep() == 1);
    }
}
