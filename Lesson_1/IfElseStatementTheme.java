public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задание 1: Перевод псевдокода на язык Java;");
        int age = 19;
        String sex = "male";
        double height = 1.8;
        String name = "Slava";
        if (age > 20) {
            System.out.println("- Возраст больше 20 лет;");
        } else {
            System.out.println("- Возраст 20 лет или меньше;");  
        }

        if (sex != "Male" && sex != "male") {
            System.out.println("- Пол не мужской, возможно женский;");
        } else {
            System.out.println("- Пол мужской;");
        }

        if (height < 1.8) {
            System.out.println("- Рост меньше 1.8 метра;");
        } else {
            System.out.println("- Рост равен: " + height);
        }

        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("- Первая буква имени: " + firstLetterName);
        } else  if (firstLetterName == 'I') {
            System.out.println("- Первая буква имени: " + firstLetterName);
        } else {
            System.out.println("- Первая буква имени отличается от M или I;\n");
        }

        System.out.println("Задание 2: Поиск max и min числа;");
        int first = 12;
        int second = 14;
        if (first == second) {
            System.out.println(first + " = " + second);
        } else if (first > second) {
            System.out.println("Наибольшее число = " + first + " ,Наименьшее число = " + second);
        } else {
            System.out.println("Наибольшее число = " + second + " ,Наименьшее число = " + first + 
                    "\n");
        }
        System.out.println("Задание 3: Проверка числа;");
        int a = 4;
        if (a != 0) {
            if (a % 2 == 0) {
                System.out.print("Исходное число: " + a + " - четное");
            } else {
                System.out.print("Исходное число: " + a + " - нечетное");
            }

            if (a < 0) {
                System.out.println(" отрицательное");
            } else {
                System.out.println(" положительное");
            } 
        } else {
            System.out.println("Исходное число равно: " + a + "/n");
        }

        System.out.println("Задание 4: Поиск одинаковых цифр в числах;");
        int number = 999;
        int number1 = 898;
        System.out.println("Исходные числа " + number + " и " + number1);
        if (number != number1) {
            if (number / 100 == number1 / 100) {
                System.out.println("Цифры разряда сотни совпадают = " + number / 100);
            }

            if ((number / 10) % 10 == (number1 / 10) % 10) {
                System.out.println("Цифры разряда десятки совпадают = " + ((number / 10) % 10));
            }

            if (number % 10 == number1 % 10) {
                System.out.println("Цифра разряда единицы совпадают = " + number % 10);
            }

            if ((number / 100 != number1 / 100) && ((number / 10) % 10 != (number1 / 10) % 10) &&
                    (number % 10 != number1 % 10)) {
                System.out.println("Совпадений разрядов цифр нет");
            }
        }

        System.out.println("\nЗадание 5: Определение символа по его коду;");
        char sumbol = '\u0057';
        System.out.println("Введен символ: " + sumbol);
        if (sumbol >= 'A' && sumbol <= 'Z') {
            System.out.println("Большая буква");
        } else if (sumbol >= 'a' && sumbol <= 'z') {
            System.out.println("Маленькая буква");
        } else if (sumbol >= '0' && sumbol <= '9') {
            System.out.println("Число");
        } else {
            System.out.println("не буква и не число\n");
        }

        System.out.println("\nЗадание 6: Подсчет суммы вклада и начисленных банком %;");
        int contributionSumm = 100_000;
        System.out.println("Сумма вклада: " + contributionSumm + " у.е.");
        if (contributionSumm < 100_000) {
            System.out.println("Вам начислено 5 % годовых или " + (int)(contributionSumm * 0.05) + 
                    " у.е.");
            System.out.println("Итоговая сумма составит: " + (int)(contributionSumm * 0.05 + 
                    contributionSumm) + " у.е.");
        } else if (contributionSumm >= 100_000 && contributionSumm <= 300_000) {
            System.out.println("Вам начислено 7 % годовых или " + (int)(contributionSumm * 0.07) + 
                    " у.е.");
            System.out.println("Итоговая сумма составит: " + (int)(contributionSumm * 0.07 + 
                    contributionSumm) + " у.е.");
        } else if (contributionSumm > 300_000) {
            System.out.println("Вам начислено 10 % годовых или " + (int)(contributionSumm * 0.1) + 
                    " у.е.");
            System.out.println("Итоговая сумма составит: " + (int)(contributionSumm * 0.10 + 
                    contributionSumm) + " у.е.");
        }

        System.out.println("\nЗадание 7: Определение оценки по предметам;");
        int history = 59;
        int programming = 91;
        int histPoint = 1;
        int progPoint = 2;
        if (history <= 60) {
            histPoint = 2;
            System.out.println(histPoint + " - оценка по истории;");
        } else if (history > 60 && history < 74) {
            histPoint = 3;
            System.out.println(histPoint + " - оценка по истории;");
        } else if (history > 73 && history < 92) {
            histPoint = 4;
            System.out.println(histPoint + " - оценка по истории;");
        } else if (history > 91) {
            histPoint = 5;
            System.out.println(histPoint + " - оценка по истории;");
        }

        if (programming <= 60) {
            progPoint = 2;
            System.out.println(progPoint + " - оценка по программированию;");
        } else if (programming > 60 && programming < 74) {
            progPoint = 3;
            System.out.println(progPoint + " - оценка по программированию;");
        } else if (programming > 73 && programming < 92) {
            progPoint = 4;
            System.out.println(progPoint + " - оценка по программированию;");
        } else if (programming > 91) {
            progPoint = 5;
            System.out.println(progPoint + " - оценка по программированию;");
        }
        System.out.println("Средний балл оценок по предметам:" + (histPoint + progPoint) / 2 + 
                " балла");
        System.out.println("Средний процент по предметам:" + (history + programming) / 2 + "%\n");

        System.out.println("Задание 8: Расчет прибыли за год;");
        int rent = 5000;
        int sales = 13000;
        int price = 9000;
        int yearDividend = ((sales * 12) - ((price + rent)*12));
        if (yearDividend >= 0) {
            System.out.print("Прибыль за год: ");
            System.out.printf("%+d", yearDividend);
            System.out.print(" рублей");
        } else {
            System.out.println("Прибыль за год: " + yearDividend + " рублей");
        }

        System.out.println("Задание 9: Подсчет количества банкнот;");
        int requireUsd = 367;
        int total100Usd = 2;
        int total10Usd = 10;
        int total1Usd = 80;
        int require100 = requireUsd / 100;
        int require10 = (requireUsd % 100) / 10;
        int require1 = (requireUsd % 10);
        if ((total100Usd * 100) + (total10Usd * 10) + (total1Usd) >= requireUsd) {
            if (requireUsd / 100 <= total100Usd) {
                total100Usd = total100Usd - (requireUsd / 100);
            } else {
                total10Usd = total10Usd + (total100Usd - requireUsd / 100);
            }

            if ((requireUsd % 100) / 10 <= total10Usd) {
                total10Usd = total10Usd - (requireUsd % 100) / 10;
            } else total1Usd = total1Usd + (total10Usd - (requireUsd % 100) / 10);
        } else {
            System.out.println("В банкомате недостаточно денег");
        }
        System.out.println("total100Usd = " + total100Usd);
        System.out.println("total10Usd = " + total10Usd);
        System.out.println("total1Usd = " + total1Usd);
    }
}
