package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {

     public static void main(String[] args) {
        invertNumbers();
        multiplyNumbers();
        deleteNumbers();
        printAlphabet();
        insertUniqueElements();
    }

    private static void invertNumbers() {
        System.out.println("Задание 1 Реверс значений массива");
        int[] randomNumbers = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("   До реверса: ");
        printArray(randomNumbers);
        invertArray(randomNumbers);
        System.out.print("После реверса: ");
        printArray(randomNumbers);
    }

    private static void multiplyNumbers() {
        System.out.println("\n\nЗадание 2 Произведение элементов массива");
        int[] multipliers = new int[10];
        for (int i = 0; i < multipliers.length; i++) {
            multipliers[i] = i;
        }
        multiply(multipliers);
    }

    private static void deleteNumbers() {
        System.out.println("\n\nЗадание 3 Удаление элементов массива");
        double[] randomNumbers = new double[15];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        printArray(randomNumbers);
        System.out.println("\nИзмененный массив: ");
        nullificateCells(randomNumbers);
    }

    private static void printAlphabet() {
        System.out.println("\nЗадание 4 Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        printArray(alphabet);
    }

    private static void insertUniqueElements() {
        System.out.println("\nЗадание 5 Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        for (int i = 0; i < uniqueNumbers.length; i++) {
            uniqueNumbers[i] = (int) (Math.random() * (40)) + 60;
        }
        System.out.println("\nвывод созданного массива");
        printArray(uniqueNumbers);
        makeUniqueNumber(uniqueNumbers);
        sort(uniqueNumbers);
        System.out.println("вывод массива по возрастанию без дубликатов");
        printArray(uniqueNumbers);
    }

    private static void printArray(int[] inputArray) {
        int count = 0;
        for (int element : inputArray) {
            System.out.printf("%s ", element);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printArray(double[] inputArray) {
        double middleCellValue = inputArray[inputArray.length / 2];
        for (double element : inputArray) {
            System.out.printf("%.3f ", element);
            if (element == middleCellValue) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printArray(char[] inputArray) {
        int count = inputArray.length - 2;
        for (char element : inputArray) {
            for (int i = inputArray.length - 1; i > count; i--) {
                System.out.print(inputArray[i]);
            }
            count--;
            System.out.println();
        }
        System.out.println();
    }

    private static void invertArray(int[] inputArray) {
        int reverseCell = inputArray.length - 1;
        for (int i = 0; i < inputArray.length / 2; i++) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[reverseCell];
            inputArray[reverseCell] = temp;
            reverseCell--;
        }
    }

    private static void multiply(int[] inputArray) {
        int multiplyNumbers = 1;
        for (int i = 1; i < inputArray.length - 1; i++) {
            multiplyNumbers *= inputArray[i];
            System.out.print(inputArray[i] + (i >= inputArray.length - 2 ? " = " : " * "));
        }
        System.out.println(multiplyNumbers);
    }

    private static void nullificateCells(double[] inputArray) {
        double middleCellValue = inputArray[inputArray.length / 2];
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > middleCellValue) {
                inputArray[i] = 0;
                count++;
            }
        }
        printArray(inputArray);
        System.out.println("\nКоличество обнуленных ячеек = " + count + "\n");
    }

    private static void makeUniqueNumber(int[] inputArray) {
        boolean isDuplicate;
        do {
            isDuplicate = false;
            for (int i = 0; i < inputArray.length; i++) {
                for (int j = i + 1; j < inputArray.length; j++) {
                    if (inputArray[j] == inputArray[i]) {
                        inputArray[j] = (int) (Math.random() * (40)) + 60;
                        isDuplicate = true;
                    }
                    if (isDuplicate) {
                        break;
                    }
                }
            }
        } while (isDuplicate);
    }

    private static void sort(int[] inputArray) {
        for (int i = inputArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }
    }
}
