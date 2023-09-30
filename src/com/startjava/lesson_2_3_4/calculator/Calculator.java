package com.startjava.lesson_2_3_4.calculator;

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
            System.out.print(number + " " + sign + " " + number1 + " = " + result);
            /*f (result % 1 == 0) {
                System.out.print(result);
            } else  {
                System.out.print(result);
            }*/
        } else  {
            System.out.println("Ошибка: знак " + sign + " не поддерживается");
        }
    }
}
