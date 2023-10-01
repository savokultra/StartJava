package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcTest = new Calculator();
        Scanner sc = new Scanner(System.in);
        String agree;
        do {
            System.out.println("Введите выражение ");
            String expression = sc.nextLine();
            calcTest.setExpression(expression);
            calcTest.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                agree = sc.nextLine();
            } while (!agree.equals("yes") && !agree.equals("no"));
        } while (agree.equals("yes"));
    }
}
