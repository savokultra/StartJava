public class Calculator {

    public static void main (String [] args) {
        int number = 4;
        int number1 = 3;
        char sign = '^';
        int result = number;
        if (sign == '+') {
            result+= number1;
        } else if (sign == '-') {
            result-= number1;
        } else if (sign == '*') {
            result*= number1;
        } else if (sign == '/') {
            result/= number1;
        } else if (sign == '%') {
            result%= number1;
        } else if (sign == '^') {
            int count = number1;
            while (count > 1) {
                result*= result;
                count--;
            }
        }
        System.out.println(number + " " + sign + " " + number1 + " = " + result);
    }
}
