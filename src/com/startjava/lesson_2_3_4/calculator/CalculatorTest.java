package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcTest = new Calculator();
        Scanner sc = new Scanner(System.in);
        String agree;
        char sign1;
        do {
            System.out.println("Введите выражение ");
            String expressoin = sc.nextLine();
            String[] numbers = expressoin.split("[-+*/^]");
            for (String word : numbers) {
                System.out.println("word: " + word);
            }
            if (expressoin.contains("-")) {
                sign1 = '-';
            }
            if (expressoin.contains("+")) {
                sign1 = '+';
            }
            System.out.println("Введите первое число: ");
            int number = sc.nextInt();
            calcTest.setNumber(number);
            System.out.println("Введите знак математической операции: + - * / ^ ");
            char sign = sc.next().charAt(0);
            calcTest.setSign(sign);
            System.out.println("Введите второе число: ");
            int number1 = sc.nextInt();
            calcTest.setNumber1(number1);
            calcTest.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                sc.nextLine();
                agree = sc.nextLine();
            } while (!agree.equals("yes") && !agree.equals("no"));
        } while (agree.equals("yes"));
    }
}
