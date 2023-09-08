package com.startjava.lesson_2_3_4.array;

public class ArraysTheme {

    public static void main(String[] args) {
        elementsReverse();
        elementsMultiplication();
        elementsDeletion();
        alphabetOutput();
        uniqueElementsCreate();
    }

    public static void elementsReverse() {
        System.out.println("Задание 1 Реверс значений массива");
        int[] randomNumbers = {1, 7, 4, 5, 2, 6, 3};
        int[] reverseRandomNumbers = new int[randomNumbers.length];
        System.out.print("   До реверса: ");
        for (int a : randomNumbers) {
            System.out.print(a + " ");
        }
        System.out.print("\nПосле реверса: ");
        int length = randomNumbers.length;
        for (int y : reverseRandomNumbers) {
            y = randomNumbers[length - 1];
            length--;
            System.out.print(y + " ");
        }
    }

    public static void elementsMultiplication() {
        System.out.println("\n\nЗадание 2 Произведение элементов массива");
        int multNumbers = 1;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (int i = 1; i < numbers.length - 1; i++) {
            multNumbers *= i;
            char ch = i < numbers.length - 2 ? '*' : '=';
            System.out.print(i + " " + ch + " ");
        }
        System.out.print(multNumbers);
    }

    public static void elementsDeletion() {
        System.out.println("\n\nЗадание 3 Удаление элементов массива");
        double[] randomNumbers = new double[15];
        System.out.print("  Исходный массив: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            double randomNumber = Math.random();
            randomNumbers[i] = randomNumber;
            System.out.printf("%.3f ", randomNumber);
        }

        double centreCell = randomNumbers[randomNumbers.length / 2];
        int count = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > centreCell) {
                randomNumbers[i] = 0;
                count++;
            }
        }
        System.out.print("\nИзмененный массив: ");
        for (double x : randomNumbers) {
            System.out.print(String.format("%.3f ", x));
        }
        System.out.println("\nКоличество обнуленных ячеек = " + count + "\n");
    }

    public static void alphabetOutput() {
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

    public static void uniqueElementsCreate() {
        System.out.println("\nЗадание 5 Заполнение массива уникальными числами");
        // создание массива
        int[] randomNumbers = new int[30];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * (40)) + 60;
        }
        //вывод созданного массива
        System.out.println("\nвывод созданного массива");
        int count = 0;
        for (int x : randomNumbers) {
            System.out.print(x + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        //удаление дубликатов массива
        boolean b;
        do {
            b = false;
            for (int i = 0; i < randomNumbers.length; i++) {
                for (int j = i + 1; j < randomNumbers.length; j++) {
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
        for (int i = randomNumbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < randomNumbers.length - 1; j++) {
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
