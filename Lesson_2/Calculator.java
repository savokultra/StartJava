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

    public switch(sign) {
        case + :
            result = number + number1;
            System.out.println("Результат сложения равен: " + result);
    }
/*        int result = number;
        if (sign == '+') {
            result += number1;
        } else if (sign == '-') {
            result -= number1;
        } else if (sign == '*') {
            result *= number1;
        } else if (sign == '/') {
            result /= number1;
        } else if (sign == '%') {
            result %= number1;
        } else if (sign == '^') {
            int count = number1;
            while (count > 1) {
                result *= result;
                count--;
            }
        }
        System.out.println(number + " " + sign + " " + number1 + " = " + result);*/
}
