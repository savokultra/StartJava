public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Задание 1: Подсчет суммы четных и нечетных чисел;");
        int i = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
            i++;
        } while (i <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);

        System.out.println("\nЗадание 2: Вывод чисел в интервале (min и max) в порядке убывания;");
        int value1 = 10;
        int value2 = 5;
        int value3 = -1;
        int max = 0;
        int min = 0;
        int j = 0;
        if (value1 > value2 && value1 > value3) {
            max = value1;
        } else {
            min = value1;
        }
        if (value2 > value1 && value2 > value3) {
            max = value2;
        } else {
            min = value2;
        }
        if (value3 > value1 && value3 > value2) {
            max = value3;
        } else {
            min = value3;
        }
        for (j = --max; j > min; --j) {
            System.out.print(j);
        }

        System.out.println("\n\nЗадание 3: Вывод реверсивного числа и суммы его цифр;");
        int number = 1234;
        int k = 0;
        int thousand = 0;
        int hundred = 0;
        int ten = 0;
        int one = 0;
        while (k < number) {
            k++;
            thousand = k / 1000;
            hundred = (k - 1000) / 100;
            ten = (k % 100) / 10;
            one = k % 10;
        }
        int sum = one + ten + hundred + thousand;
        System.out.printf("Исходное число в обратном порядке: %d%d%d%d", one, ten, hundred, 
                thousand);
        System.out.println("\nСумма цифр: " + sum);

        System.out.println("\nЗадание 4: Вывод чисел на консоль в несколько строк;");
        //полуинтервал [1, 24) число 24 не включаем в полуинтервал
        int l = 1;
        for (; l < 24; l+= 2) {
            System.out.printf("%3d", l);
            if (l % 10 == 9) {
                System.out.println("");
            }
        }
        for (; l % 10 != 1; l+= 2) {
            System.out.print("  0");
        }

        System.out.println("\n\nЗадание 5: Проверка количества двоек на четность/нечетность;");
        int value = 3242592;
        int value4 = value;
        int count = 0;
        while (value > 1) {
            value-= 2;
            count+= 1;
        }
        if (count % 2 != 0) {
            System.out.println("Число " + value4 + " содержит нечетное количество двоек " + count);
        } else {
            System.out.println("Число " + value4 + " содержит четное количество двоек " + count);
        }

        System.out.println("\nЗадание 6: Отображение фигур в консоли;");
        for (int n = 0; n < 50; n++) {
            System.out.print("*");
            if (n % 10 == 9) {
                System.out.println("");
            }
        }
        System.out.println("");
        int m = 0;
        int n = 5;
        int o = 5;
        while (m < 15) {
            System.out.print("#");
            m++;
            for (;m == n; n+= o) {
                System.out.println("");
                o--;
            }
        }
        System.out.println("");
        int p1 = 1;
        int q2 = 1;
        int r3 = q2;
        do {
            System.out.print("$");
            if (p1 == q2) {
                System.out.println("");
                r3++;
                q2+= r3;
            }
            p1++;
        } while (p1 < 7);
        do {
            System.out.print("$");
            if (p1 == q2) {
                System.out.println("");
            }
            p1--;
            q2-= r3;
        } while (p1 > 4);

        System.out.println("\nЗадание 7: Отображение ASCII-символов;");
        System.out.println("Dec Char");
        for (int r = 33; r < 48; r++) {
            if (r % 2 != 0) {
                char ch = (char) r;
                System.out.printf("%3d%5s%n", r, ch);
            }
        }
        System.out.println("\nDec Char");
        for (int r = 97; r < 123; r++) {
            if (r % 2 == 0) {
                char ch = (char) r;
                System.out.printf("%3d%5s%n", r, ch);
            }
        }

        System.out.println("\nЗадание 8: Проверка, является ли число палиндромом;");
        int number1 = 1234321;
        int invertOfnumber = 0;
        int copyOfnumber = number1;
        while (copyOfnumber != 0) {
            invertOfnumber = invertOfnumber * 10 + copyOfnumber % 10;
            copyOfnumber = copyOfnumber / 10;
        }
        if (invertOfnumber == number1) {
            System.out.println("Число " + number1 + " является палиндромом");
        } else {
            System.out.println("Число " + number1 + " не является палиндромом");
        }

        System.out.println("\nЗадание 9: Определение, является ли число счастливым;");
        int count1 = 123321;
        int count1Clone = count1;
        int count1Sum = 0;
        int count2Sum = 0;
        int countDevider = 10;
        int firstValue = 0;
        while ((count1Clone / countDevider) > 1) {
            countDevider*= 10;
        }
        while (count1Clone > 1000) {
        count1Sum = count1Sum + count1Clone / countDevider; 
        firstValue = count1Clone / countDevider;
        count1Clone = count1Clone - countDevider * firstValue;
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
    }
}