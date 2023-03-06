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
        int number1 = -1;
        int number2 = 10;
        int number3 = 5;
        int min = 0;
        int max = 0;
        if (number1 > number2 && number1 > number3) {
            max = number1; 
        }
        if (number2 > number1 && number2 > number3) {
            max = number2; 
        }
        if (number3 > number1 && number3 > number2) {
            max = number3;
        }
        if (number1 < number2 && number1 < number3) {
            min = number1;
        }
        if (number2 < number1 && number2 < number3) {
            min = number2;
        }
        if (number3 < number1 && number3 < number2) {
            min = number3;
        }
        for (int i = --max; i > min; --i) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадание 3: Вывод реверсивного числа и суммы его цифр;");
        int number = 1234;
        int numberCopy = number;
        int sum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (numberCopy > 0) {
        System.out.print(numberCopy % 10);
        sum += numberCopy % 10;
        numberCopy /= 10;
        }
        System.out.println("\nСумма цифр = " + sum);

        System.out.println("\nЗадание 4: Вывод чисел на консоль в несколько строк;");
        //полуинтервал [1, 24) число 24 не включаем в полуинтервал
        for (int i = 1; i < 24; i+= 2) {
            System.out.printf("%3d", i);
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        for (int i = 25; i % 10 != 1; i+= 2) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\nЗадание 5: Проверка количества двоек на четность/нечетность;");
        int number5 = 3242592;
        int number4 = number5;
        int countTwos = 0;
        while (number5 > 1) {
            number5-= 2;
            countTwos++;
        }
        if (countTwos % 2 != 0) {
            System.out.println("Число " + number4 + " содержит нечетное количество двоек " + 
                    countTwos);
        } else {
            System.out.println("Число " + number4 + " содержит четное количество двоек " + 
                    countTwos);
        }

        System.out.println("\nЗадание 6: Отображение фигур в консоли;\n");
        for (int n = 0; n < 50; n++) {
            System.out.print("*");
            if (n % 10 == 9) {
                System.out.println();
            }
        }
        System.out.println();
        int m = 0;
        int n = 5;
        int o = 5;
        while (m < 15) {
            System.out.print("#");
            m++;
            for (;m == n; n+= o) {
                System.out.println();
                o--;
            }
        }
        System.out.println();
        int p1 = 1;
        int q2 = 1;
        int r3 = q2;
        do {
            System.out.print("$");
            if (p1 == q2) {
                System.out.println();
                r3++;
                q2+= r3;
            }
            p1++;
        } while (p1 < 7);
        do {
            System.out.print("$");
            if (p1 == q2) {
                System.out.println();
            }
            p1--;
            q2-= r3;
        } while (p1 > 4);

        System.out.println("\n\nЗадание 7: Отображение ASCII-символов;");
        System.out.println("Dec Char");
        for (int i1 = 33; i1 < 48; i1++) {
            if (i1 % 2 != 0) {
                char ch = (char) i1;
                System.out.printf("%3d%5s%n", i1, ch);
            }
        }
        System.out.println("\nDec Char");
        for (int i1 = 97; i1 < 123; i1++) {
            if (i1 % 2 == 0) {
                char ch = (char) i1;
                System.out.printf("%3d%5s%n", i1, ch);
            }
        }

        // всё что ниже решение нашел на похожих задачах или отдельных фрагментах в сети
        System.out.println("\nЗадание 8: Проверка, является ли число палиндромом;");
        int number6 = 1234321;
        int invertOfnumber = 0;
        int copyOfnumber = number6;
        while (copyOfnumber != 0) {
            invertOfnumber = invertOfnumber * 10 + copyOfnumber % 10;
            copyOfnumber = copyOfnumber / 10;
        }
        if (invertOfnumber == number6) {
            System.out.println("Число " + number6 + " является палиндромом");
        } else {
            System.out.println("Число " + number6 + " не является палиндромом");
        }

        System.out.println("\nЗадание 9: Определение, является ли число счастливым;");
        int count1 = 123321;
        int count1Clone = count1;
        int count1Sum = 0;
        int count2Sum = 0;
        int countDevider = 10;
        int firstnumber = 0;
        while ((count1Clone / countDevider) > 1) {
            countDevider*= 10;
        }
        while (count1Clone > 1000) {
        count1Sum = count1Sum + count1Clone / countDevider; 
        firstnumber = count1Clone / countDevider;
        count1Clone = count1Clone - countDevider * firstnumber;
        countDevider/= 10;
        }
        while (count1Clone > 0) {
            count2Sum = count2Sum + count1Clone % 10;
            count1Clone = count1Clone / 10;
        }
        System.out.println("Сумма первых трёх цифр = " + count1Sum);
        System.out.println("Сумма последних трёх цифр = " + count2Sum);
        if (count1Sum == count2Sum) {
            System.out.println("Число " + count1 + " - счастливое число");
        } else {
            System.out.println("Число " + count1 + " - не счастливое число");
        }

        System.out.println("\nЗадание 10: Вывод таблицы умножения Пифагора;");
        System.out.println("\n          ТАБЛИЦА ПИФАГОРА");
        System.out.print("   |");
        for (int s = 2; s < 10; s++) {
            System.out.printf("%4d", s);
        }
        System.out.print("\n____________________________________");
        System.out.println();
        for (int s = 1; s < 9; s++) {
            System.out.printf("%2d |", s + 1);
            for (int t = 1; t < 9; t++) {
            System.out.printf("%4d", (s + 1) * (t + 1));
            }
            System.out.println();
        }
    }
}