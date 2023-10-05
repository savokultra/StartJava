package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcTest = new Calculator();
        Scanner sc = new Scanner(System.in);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.println("Введите выражение ");
                String expression = sc.nextLine();
                double result = calcTest.calculate(expression);
                outputResult(expression, result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = sc.nextLine();
        }
    }

    public static void outputResult(String expression, double result) {
        if (result != Double.MIN_VALUE) {
            System.out.print(expression + " = ");
            System.out.printf(result % 1 == 0 ? "%.0f%n" : "%.3f%n", result);
        }
    }
}
