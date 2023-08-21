package com.startjava.lesson_2_3_4.array;

import org.w3c.dom.ls.LSOutput;

public class ArraysTheme {
    int length;

    public static void taskOne() {
        System.out.println("Задание 1 Реверс значений массива");
        int[] arrayOne = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("До реверса: ");
        for (int a : arrayOne) {
            System.out.print(a + " ");
        }
        System.out.print("\nПосле реверса: ");
        for (int i = 6; i >= 0; --i) {
            System.out.print(arrayOne[i] + " ");
        }
    }
    public static void taskTwo() {
        System.out.println("\n\nЗадание 2 Произведение элементов массива");
        int sum = 1;
        int[] arrayTwo = new int[10];
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = i;
        }
        for (int i : arrayTwo) {
            if (i > 0 && i < 9) {
                sum*= i;
                System.out.print(i);
                char y = i < 8 ? '*' : '=';
                System.out.print(" " + y + " ");
            }
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }
}
