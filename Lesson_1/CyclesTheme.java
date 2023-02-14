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
        for (; l < 11; l+= 2) {
            System.out.printf("%3d", l);
        }
        System.out.println("");
        for (; l < 21; l+= 2) {
            System.out.printf("%3d", l);
        }
        System.out.println("");
        for (; l < 24; l+= 2) {
            System.out.printf("%3d", l);
        }
        while (l < 31) {
            System.out.printf("%3d", 0, l+= 2);
        }
    }
}