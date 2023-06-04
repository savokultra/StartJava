public class Calculator {

    private int number;
    private int number1;
    private char sign;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        int result = 1;
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
                for (int i = 0; i < number1; i++) {
                result *= number;
            }
                break;
            default:
                System.out.println("Такая математическая операция не поддерживается");
        }
        System.out.println(number + " " + sign + " " + number1 + " = " + result);
    }
}
