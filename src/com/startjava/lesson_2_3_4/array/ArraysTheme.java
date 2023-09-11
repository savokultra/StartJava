package com.startjava.lesson_2_3_4.array;

public class ArraysTheme {

    public static void main(String[] args) {
        invertNumbers();
        multiplicateNumbers();
        deleteNumbers();
        printAlphabet();
        insertUniqueElements();
    }

    private static void invertNumbers() {
        System.out.println("Задание 1 Реверс значений массива");
        int[] randomNumbers = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("   До реверса: " + Arrays.toString(randomNumbers));
        int reverseCell = randomNumbers.length - 1;
        for (int i = 0; i < randomNumbers.length / 2; i++) {
            int temp = randomNumbers[i];
            randomNumbers[i] = randomNumbers[reverseCell];
            randomNumbers[reverseCell] = temp;
            reverseCell--;
        }
        System.out.print("\nПосле реверса: " + Arrays.toString(randomNumbers));
    }

    private static void multiplicateNumbers() {
        System.out.println("\n\nЗадание 2 Произведение элементов массива");
        int[] numbers = new int[10];
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            numbers[i] = i;
        }
        int multNumbers = 1;
        for (int i = 1; i < length - 1; i++) {
            multNumbers *= i;
            char outputSymbol = i < length - 2 ? '*' : '=';
            System.out.print(i + " " + outputSymbol + " ");
        }
        System.out.print(multNumbers);
    }

    private static void deleteNumbers() {
        System.out.println("\n\nЗадание 3 Удаление элементов массива");
        double[] randomNumbers = new double[15];
        System.out.print("Исходный массив: \n");
        int length = randomNumbers.length;
        int centreCell = length / 2;
        for (int i = 0; i < length; i++) {
            double randomNumber = Math.random();
            randomNumbers[i] = randomNumber;
            System.out.printf("%.3f ", randomNumber);
            if (i == centreCell) {
                System.out.println("");
            }
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (randomNumbers[i] > randomNumbers[centreCell]) {
                randomNumbers[i] = 0;
                count++;
            }
        }
        System.out.print("\n\nИзмененный массив: \n");
        for (double a : randomNumbers) {
            System.out.print(String.format("%.3f ", a));
            if (a == randomNumbers[centreCell]) {
                System.out.println("");
            }
        }
        System.out.println("\n\nКоличество обнуленных ячеек = " + count + "\n");
    }

    private static void printAlphabet() {
        System.out.println("Задание 4 Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        char z = 'Z';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = z;
            z--;
        }
        int count = 1;
        for (char a : alphabet) {
            for(int i = 0; i < count; i++) {
                System.out.print(alphabet[i]);
            }
            count++;
            System.out.println();
        }
    }

    private static void insertUniqueElements() {
        System.out.println("\nЗадание 5 Заполнение массива уникальными числами");
        // создание массива
        int[] randomNumbers = new int[30];
        int length = randomNumbers.length;
        for (int i = 0; i < length; i++) {
            randomNumbers[i] = (int) (Math.random() * (40)) + 60;
        }
        //вывод созданного массива
        System.out.println("\nвывод созданного массива");
        int count = 0;
        for (int a : randomNumbers) {
            System.out.print(a + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        //удаление дубликатов массива
        boolean b;
        do {
            b = false;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (randomNumbers[i] == randomNumbers[j]) {
                        b = true;
                        randomNumbers[j] = (int) (Math.random() * (40)) + 60;
                    }
                }
                if (b) {
                    break;
                }
            }
        } while (b);
        //сортировка массива
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < length - 1; j++) {
                if (randomNumbers[j] > randomNumbers[j + 1]) {
                    int temp = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = temp;
                }
            }
        }
        System.out.println("\nвывод массива по возрастанию без дубликатов");
        for (int x : randomNumbers) {
            System.out.print(x + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
