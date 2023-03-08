public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Задание 1: Подсчет суммы четных и нечетных чисел;");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
            System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                    ", а нечетных = " + sumOdd);

        System.out.println("\nЗадание 2: Вывод чисел в интервале (min и max) в порядке убывания;");
        int number1 = 10;
        int number2 = -1;
        int number3 = 5;
        int max = 0;
        for (;max <= number1 || max <= number2 || max <= number3; max++) {
        }
        for (int i = max - 2; i > number1 || i > number2 || i > number3; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n\nЗадание 3: Вывод реверсивного числа и суммы его цифр;");
        int number = 1234;
        int sum = 0;
        int reverseNumber = 0; 
        System.out.print("Исходное число в обратном порядке: ");
        while (number > 0) {
            reverseNumber = number % 10;
            sum += reverseNumber;
            number /= 10;
            System.out.print(reverseNumber);
        }
        System.out.println("\nСумма цифр = " + sum);

        System.out.println("\nЗадание 4: Вывод чисел на консоль в несколько строк;");
        //полуинтервал [1, 24) число 24 не включаем в полуинтервал
        int interval = 24;
        for (int i = 1; i < interval; i += 2) {
            System.out.printf("%3d", i);
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        for (;interval % 10 != 0; interval += 2) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\nЗадание 5: Проверка количества двоек на четность/нечетность;");
        int number5 = 3242592;
        int copyNumber5 = number5;
        int countTwos = 0;
        while (copyNumber5 > 0) { 
            if (copyNumber5 % 10 == 2) {
                countTwos ++;
            }
            copyNumber5 /= 10;
        }
        if (countTwos % 2 != 0) {
            System.out.println("Число " + number5 + " содержит нечетное количество двоек = " + 
                    countTwos);
        } else {
            System.out.println("Число " + number5 + " содержит четное количество двоек = " + 
                    countTwos);
        }

        System.out.println("\nЗадание 6: Отображение фигур в консоли;\n");
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
            if (i % 10 == 9) {
                System.out.println();
            }
        }

        System.out.println();
        int counter1 = 0;
        int size = 5;
        while (counter1 <= size && size != 0) {
            System.out.print("#");
            counter1++;
            if (counter1 == size) {
                System.out.println();
                size--;
                counter1 = 0;
            }
        }
        
        System.out.println();
        int dollar = 1;
        int dollarCounter = 1;
        int copyDollar = dollarCounter;
        do {
            System.out.print("$");
            if (dollar == dollarCounter) {
                System.out.println();
                copyDollar++;
                dollarCounter += copyDollar;
            }
            dollar++;
        } while (dollar < 7);
        do {
            System.out.print("$");
            if (dollar == dollarCounter) {
                System.out.println();
            }
            dollar--;
            dollarCounter -= copyDollar;
        } while (dollar > 4);

        System.out.println("\n\nЗадание 7: Отображение ASCII-символов;");
        System.out.println("Dec Char");
        for (int i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d%5s%n", i, (char) i);
            }
        }
        System.out.println("\nDec Char");
        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%3d%5s%n", i, (char) i);
            }
        }

        // всё что ниже решение нашел на похожих задачах или отдельных фрагментах в сети
        System.out.println("\nЗадание 8: Проверка, является ли число палиндромом;");
        int palindrome = 1234321;
        int invertpalindrome = 0;
        int copypalindrome = palindrome;
        while (copypalindrome > 0) {
            invertpalindrome = invertpalindrome * 10 + copypalindrome % 10;
            copypalindrome /= 10;
        }
        if (invertpalindrome == palindrome) {
            System.out.println("Число " + palindrome + " является палиндромом");
        } else {
            System.out.println("Число " + palindrome + " не является палиндромом");
        }

        System.out.println("\nЗадание 9: Определение, является ли число счастливым;");
        int happyNumber = 123321;
        int happyNumberClone = happyNumber;
        int happyNumberSum = 0;
        int countSum = 0;
        int countDevider = 10;
        int firstnumber = 0;
        while ((happyNumberClone / countDevider) > 1) {
            countDevider *= 10;
        }
        while (happyNumberClone > 1000) {
            happyNumberSum = happyNumberSum + happyNumberClone / countDevider; 
            firstnumber = happyNumberClone / countDevider;
            happyNumberClone = happyNumberClone - countDevider * firstnumber;
            countDevider /= 10;
        }
        while (happyNumberClone > 0) {
            countSum = countSum + happyNumberClone % 10;
            happyNumberClone = happyNumberClone / 10;
        }
        System.out.println("Сумма первых трёх цифр = " + happyNumberSum);
        System.out.println("Сумма последних трёх цифр = " + countSum);
        if (happyNumberSum == countSum) {
            System.out.println("Число " + happyNumber + " - счастливое число");
        } else {
            System.out.println("Число " + happyNumber + " - не счастливое число");
        }

        System.out.println("\nЗадание 10: Вывод таблицы умножения Пифагора;");
        System.out.println("\n          ТАБЛИЦА ПИФАГОРА");
        System.out.print("   |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.print("\n____________________________________");
        System.out.println();
        for (int i = 1; i < 9; i++) {
            System.out.printf("%2d |", i + 1);
            for (int j = 1; j < 9; j++) {
                System.out.printf("%4d", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}