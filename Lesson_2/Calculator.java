public class Calculator {

    private int number;
    private int number1;
    private int result;
    private char sign;

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

    public void switchCalc() {
        switch(sign) {
            case '+':
                result = number + number1;
                break;
            case '-':
                result = number - number1;
                break;
            case '/':
                if (number1 != 0) {
                    result = number / number1;
                } else {
                    System.out.println("На 0 делить нельзя!");
                }
                break;
            case '*':
                result = number * number1;
                break;
            case '^':
                int degree = number;
                int numberCopy = number;
                int number1Copy = number1;
                while (number1Copy > 1) {
                    numberCopy *= degree;
                    number1Copy--;
                }
                result = numberCopy;
                break;
            default:
                System.out.println("Такая математическая операция не поддерживается");
        }
        System.out.println(number + " " + sign + " " + number1 + " = " + result);
    }
}
