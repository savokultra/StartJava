package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String expression) {
        String[] elements = expression.split(" ");
        double a = Integer.parseInt(elements[0]);
        char sign = elements[1].charAt(0);
        double b = Integer.parseInt(elements[2]);
        double result = 0;
        switch(sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("На 0 делить нельзя!");
                }
            case '*':
                return a * b;
            case '^':
                return Math.pow(a, b);
            default:
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                return Double.MIN_VALUE;
        }
    }
}
