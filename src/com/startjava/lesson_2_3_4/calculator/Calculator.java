package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private double number;
    private double number1;
    private char sign;

    public void setNumber(double number) {
        this.number = number;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        double result = 1;
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^') {
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
                    System.out.println("Что то пошло не так");
                    break;
            }
            System.out.printf("%.0f %c %.0f %s" ,number, sign, number1, " = ");
            if (result % 1 == 0) {
                System.out.printf("%.0f%n", result);
            } else  {
                System.out.printf("%.3f%n", result);
            }
        } else  {
            System.out.println("Ошибка: знак " + sign + " не поддерживается");
        }
    }
}
