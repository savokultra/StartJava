import.java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcTest = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите знак математической операции: ");
        char sign = scanner.nextChar();
        calcTest.setNumber(number);
        calcTest.setNumber1(number1);
        calcTest.setSign(sign);
        calcTest.sign();
    }
}
