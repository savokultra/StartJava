package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private double number;
    private double number1;
    private double result;
    private char sign;

    public void setNumber(double number) {
        this.number = number;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }
    
    public double getResult() {
        return result;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate(String expression) {
        String[] numbers = expression.split(" ");
        setNumber(Integer.parseInt(numbers[0]));
        setSign(numbers[1].charAt(0));
        setNumber1(Integer.parseInt(numbers[2]));
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
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                break;
        }
        System.out.printf("%.0f %c %.0f %s" ,number, sign, number1, "= ");
    }
}
