package com.startjava.lesson_2_3_4.array;

public class ArraysTheme {

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
                char ch = i < 8 ? '*' : '=';
                System.out.print(i + " " + ch + " ");
            }
        }
        System.out.print(sum);
    }

    public static void taskThree() {
        System.out.println("\n\nЗадание 3 Удаление элементов массива");
        double[] arrayThree = new double[15];
        System.out.print("\n  Исходный массив: ");
        for (int i = 0; i < 15; i++) {
            double randomNumber = Math.random();
            arrayThree[i] = randomNumber;
            System.out.printf("%.3f ", randomNumber);
        }
        
        int cell = arrayThree.length / 2;
        int count = 0;
        
        for (int i = 0; i < 15; i++) {
            if (arrayThree[i] > arrayThree[cell]) {
                arrayThree[i] = 0;
                count++;
            }
        }
        System.out.print("\nИзмененный массив: ");
        for (double x : arrayThree) {
            System.out.print(String.format("%.3f ", x));
        }
        System.out.println("\nКоличество обнуленных ячеек = " + count);
    }

    public static void taskFour() {
        char[] arrayFour = new char[26];
        char z = 'Z';
        for(int i = 0; i < arrayFour.length; i++) {
            arrayFour[i] = z;
            System.out.print(z);
            z--;
        }

        int four = 1;
        for(char a : arrayFour) {
            for(int i = 0; i < four; i++) {
                System.out.print(arrayFour[i]);
            }
            four++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
    }
}
