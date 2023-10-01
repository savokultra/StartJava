package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcTest = new Calculator();
        Scanner sc = new Scanner(System.in);
        String agree = "yes";
        while (!agree.equals("no")) {
            if (agree.equals("yes")) {
                System.out.println("Введите выражение ");
                String expression = sc.nextLine();
                calcTest.setExpression(expression);
                calcTest.calculate();
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            agree = sc.nextLine();
        }
    }
}
