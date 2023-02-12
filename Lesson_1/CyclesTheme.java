public class CyclesTheme {

    public static viod main(String[] args) {
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
        int point1 = 10;
        int point2 = 5;
        int point3 = -1;
        int max = 0;
        int min = 0;
        int i = 0;
        if (point1 > point2 && point1 > point3) {
            max = point1;
        } else {
            min = point1;
        }
        if (point2 > point1 && point2 > point3) {
            max = point2;
        } else {
            min = point2;
        }
        if (point3 > point1 && point3 > point2) {
            max = point3;
        } else {
            min = point3;
        }
        for (i = --max; i > min; --i) {
            System.out.print(i);
        }

        System.out.println("\nЗадание 3: Вывод реверсивного числа и суммы его цифр;");
        int number = 1234;
        int i = 0;
        int thousend = 0;
        int hundred = 0;
        int ten = 0;cd
        int one = 0;
        while (i < number) {
            i++;
            thousend = i / 1000;
            hundred = (i - 1000) / 100;
            ten = (i % 100) / 10;
            one = i % 10;
        }
        System.out.println("thousend " + thousend);
        System.out.println("hundred " + hundred);
        System.out.println("ten " + ten);
        System.out.println("one " + one);
        System.out.println("i " + i);
    }
}