public class VariablesTheme {

    public static void main(String [] args) {
        //Задание 1: Вывод значений переменных на консоль;
        System.out.println("Задание 1: Вывод значений переменных на консоль ");
        byte cores = 10;
        System.out.println("Количество ядер процессора: " + cores);
        short ramGb = 16;
        System.out.println("Объем оперативной памяти ГБ: " + ramGb);
        int winBits = 64;
        System.out.println("Разрядность операционной системы Бит: " + winBits);
        long hddVolumeTb = 3;
        System.out.println("Объем жесткого диска ТБ: " + hddVolumeTb);
        float coreVolt = 0.856f;
        System.out.println("Напряжение центрального процессора V: " + coreVolt);
        double maxTdp = 125.0d;
        System.out.println("Максимальное энергопотребление W: " + maxTdp);
        char sysHdd = 'C';
        System.out.println("Системный диск: " + sysHdd);
        boolean updated = true;
        System.out.println("Обновления установлены: " + updated + '\n');

        //Задание 2: Расчет стоимости товара со скидкой;
        System.out.println("Задание 2: Расчет стоимости товара со скидкой");
        float penPrice = 100f;
        float bookPrice = 200f;
        float discount = 0.11f;
        //Общая стоимость товаров руб
        float totalPrice = (penPrice + bookPrice);
        //Сумма скидки руб
        float discountSum = ((penPrice + bookPrice) * discount);
        //Общая стоимость товаров с скидкой руб
        float discountPrice = (totalPrice - discountSum);
        System.out.println("Общая стоимость товаров руб: " + totalPrice);
        System.out.println("Сумма скидки руб: " + discountSum);
        System.out.println("Общая стоимость товаров с скидкой руб: " + discountPrice + '\n');

        //Задание 3: Вывод слова JAVA;
        System.out.println("Задание 3: вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n");

        //Задание 4: Вывод min и max значений целых числовых типов;
        System.out.println("Задание 4: вывод MIN MAX целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println("Тип byte, max: " + byteMax);
        System.out.println("++byte: " + ++byteMax);
        System.out.println("--byte: " + --byteMax);
        System.out.println("Тип short, max: " + shortMax);
        System.out.println("++short: " + ++shortMax);
        System.out.println("--short: " + --shortMax);
        System.out.println("Тип int, max: " + intMax);
        System.out.println("++int: " + ++intMax);
        System.out.println("--int: " + --intMax);
        System.out.println("Тип long, max: " + longMax);
        System.out.println("++long: " + ++longMax);
        System.out.println("--long: " + --longMax + '\n');

        //Задание 5: Перестановка значений переменных;
        System.out.println("Задание 5: Перестановка значений переменных;");
        int a = 2;
        int b = 5;
        int temp = a;
        System.out.println("С помощью третьей переменной: ");
        System.out.println("Исходные значения переменных: " + "a = " + a + " b = " + b);
         // a = 5
        a = b;
        // b = 2 т.к. a присвоено значение b после инициализации temp
        b = temp;
        System.out.println("Новые значения переменных: " + "a = " + a + " b = " + b);
        System.out.println("С помощью арифметических операций: ");
        System.out.println("Исходные значения переменных: " + "a = " + a + " b = " + b);
         /* a = 7; мне кажется в случае арифметических выражений комментарий с права от выражения 
         удобнее*/
        a = a + b;
         // b = 2
        b = a - b;
         //a = 5
        a = a - b;
        System.out.println("Новые значения переменных: " + "a = " + a + " b = " + b);
        System.out.println("С помощью побитовой операции: ");
        System.out.println("Исходные значения переменных: " + "a = " + a + " b = " + b);
        //побитовые операции https://proproprogs.ru/java_base/bitovye-operacii-i-ili-ne-xor
         //двоичный вид a(2): 00000010; a XOR b = 00000111 или 7; a = 7
        a ^= b;
         //двоичный вид b(5): 00000101; b XOR a = 00000010 или 2; b = 2
        b ^= a;
         // a XOR b = 000000101 или 5; a = 5
        a ^= b;
        System.out.println("Новые значения переменных: " + "a = " + a + " b = " + b + '\n');

        System.out.println("Задание 6: Вывод символов и их кодов;");
        char sharp = '#';
        char ampersand = '&';
        char dog = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println("Код символа: " + (int)sharp + " Символ: " + sharp);
        System.out.println("Код символа: " + (int)ampersand + " Символ: " + ampersand);
        System.out.println("Код символа: " + (int)dog + " Символ: " + dog);
        System.out.println("Код символа: " + (int)caret + " Символ: " + caret);
        System.out.println("Код символа: " + (int)underscore + " Символ: " + underscore +'\n');

        System.out.println("Задание 7: Вывод в консоль ASCII-арт Дюка;");
        char slash = '/';
        char backslash = '\\';
        char undScore = '_';
        char bracket = '(';
        char bBracket = ')';
        System.out.printf("    %c%c\n", slash, backslash);
        System.out.printf("   %c  %c\n", slash, backslash);
        System.out.printf("  %c%c%c %c%c\n", slash, undScore, bracket, bBracket, backslash);
        System.out.printf(" %c      %c\n", slash, backslash);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", slash, undScore, undScore, undScore, undScore, 
            slash, backslash, undScore, undScore, backslash);

        System.out.println("\nЗадание 8: Вывод количества сотен, десятков и единиц числа;");
        int srcNumber = 123;
        int hundred = srcNumber / 100;
        int ten = srcNumber % 100 / 10;
        int one = srcNumber % 10;
        System.out.println("Число N содержит: " + hundred + " сотен");
        System.out.println("Число N содержит: " + ten + " десятков");
        System.out.println("Число N содержит: " + one + " единиц");
        System.out.println("Сумма цифр числа N: " + hundred + ten + one);
        System.out.println("Произведение цифр числа N: " + hundred * ten * one + '\n');

        System.out.println("Задание 9: Вывод времени;");
        int totalSec = 86399;
        int hour = totalSec / 3600;
        int min = totalSec % 3600 / 60;
        int sec = totalSec % 60;
        System.out.print(hour + ":" + min + ":" + sec);
    }
}