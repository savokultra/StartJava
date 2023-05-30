import java.util.Scanner;

public class Calculator {

    private String string;
    private int number;
    private int number1;
    private int result;
    private char sign;
    private int check;
    private boolean checkString;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void switchMethod() {
        switch(sign) {
            case '+':
                number += number1;
                System.out.println("Результат сложения равен: " + number);
                break;
            case '-':
                number -= number1;
                System.out.println("Результат вычитания равен: " + number);
                break;
            case '/':
                if (number1 != 0) {
                    number /= number1;
                    System.out.println("Результат вычитания равен: " + number);
                } else {
                    System.out.println("На 0 делить нельзя!");
                }
                break;
            case '*':
                number *= number1;
                System.out.println("Результат вычитания равен: " + number);
                break;
            case '^':
                int degree = number;
                while (number1 > 1) {
                    number *= degree;
                    number1--;
                }
                System.out.println("Результат возведения в степень равен: " + number);
                break;
            default:
                System.out.println("Такая математическая операция не поддерживается");
        }
    }

    public void scannerString() {
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
    }

    public int check() {
        if (getString().contains("yes")) {
            check = 1;
        } else if (getString().contains("no")){
            check = 2;
        } else {
            check = 3;
        }
    return check;
    }

    /*public boolean checkString() {
        checkString = getString().contains("yes");
        return checkString;
    }*/

}
