public class Calculator {

    public static void main (String [] args) {
        int number = 4;
        int number1 = 3;
        char sign = '^';
        int numberCopy = number;
        if (sign == '+') {
            number+= number1;
        } else if (sign == '-') {
            number-= number1;
        } else if (sign == '*') {
            number*=  number1;
        } else if (sign == '/') {
            number/= number1;
        } else if (sign == '%') {
            number%=  number1;
        } else if (sign == '^') {
            int count = number1;
            while (count > 1) {
                number*= number;
                count--;
            }
        }
        System.out.println(numberCopy + " " + sign + " " + number1 + " = " + number);
    }
}