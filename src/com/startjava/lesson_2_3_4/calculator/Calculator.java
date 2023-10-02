package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String expression) {
        String[] elements = expression.split(" ");
        double number = Integer.parseInt(elements[0]);
        char sign = elements[1].charAt(0);
        double number1 = Integer.parseInt(elements[2]);
        double result = 0;
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
                result = Math.pow(number, number1);
                break;
            default:
                result = Double.MIN_VALUE;
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                break;
        }
        return result;
    }
}
