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
                calcTest.calculate(expression);
                System.out.println(calcTest.calculate(expression) == Double.MIN_VALUE);
                /*if (calcTest.calculate(expression) != Double.MIN_VALUE) {
                    System.out.print(expression + " = ");
                    System.out.printf(calcTest.calculate(expression) % 1 == 0 ? "%.0f%n" : "%.3f%n",
                            calcTest.calculate(expression));
                }*/
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            agree = sc.nextLine();
        }
    }
}
