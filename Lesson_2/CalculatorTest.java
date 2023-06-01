import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcTest = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String agree;
        do {
            System.out.println("Введите первое число: ");
            int number = scanner.nextInt();
            calcTest.setNumber(number);
            System.out.println("Введите знак математической операции: + - * / ^ ");
            char sign = scanner.next().charAt(0);
            calcTest.setSign(sign);
            System.out.println("Введите второе число: ");
            int number1 = scanner.nextInt();
            calcTest.setNumber1(number1);
            calcTest.switchCalc();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                agree = scanner.nextLine();
                calcTest.setAgree(agree);
            } while (calcTest.checkNextStep() == 3);
        } while (calcTest.checkNextStep() == 1);
    }
}
