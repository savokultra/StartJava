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
        int number11 = 12;
        int number12 = 14;
        if (number11 == number12) {
            System.out.println(number11 + " = " + number12);
        } else if (number11 > number12) {
            System.out.println("Наибольшее число = " + number11 + " ,Наименьшее число = " + 
                    number12);
        } else {
            System.out.println("Наибольшее число = " + number12 + " ,Наименьшее число = " + 
                    number11);
        }
        System.out.println("\nЗадание 3: Проверка числа;");
        int checkNumber = 4;
        if (checkNumber != 0) {
            if (checkNumber % 2 == 0) {
                System.out.print("Исходное число: " + checkNumber + " - четное");
            } else {
                System.out.print("Исходное число: " + checkNumber + " - нечетное");
            }
            if (checkNumber < 0) {
                System.out.println(" отрицательное");
            } else {
                System.out.println(" положительное");
            }
        } else {
            System.out.println("Исходное число равно: " + checkNumber);
        }

        System.out.println("\nЗадание 4: Поиск одинаковых цифр в числах;");
        int number = 999;
        int number1 = 456;
        int numberHundred = number / 100;
        int number1Hundred = number1 / 100;
        int numberTen = number / 10;
        int number1Ten = number1 / 10;
        int numberOne = number % 10;
        int number1One = number1 % 10;
        System.out.println("Исходные числа " + number + " и " + number1);
        if (number == number1) {
            System.out.println("Все разряды совпадают");
            }
            if (numberHundred == number1Hundred) {
                System.out.println("Цифры разряда сотни совпадают = " + numberHundred);
            }
            if ((numberTen) % 10 == (number1Ten) % 10) {
                System.out.println("Цифры разряда десятки совпадают = " + ((numberTen) % 10));
            }
            if (numberOne == number1One) {
                System.out.println("Цифра разряда единицы совпадают = " + numberOne);
            } else {
                System.out.println("Совпадений разрядов цифр нет");
        }


        System.out.println("\nЗадание 5: Определение символа по его коду;");
        char symbol = '\u0057';
        System.out.println("Введен символ: " + symbol);
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Маленькая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Число");
        } else {
            System.out.println("не буква и не число\n");
        }

        System.out.println("\nЗадание 6: Подсчет суммы вклада и начисленных банком %;");
        int contributionSumm = 90_000;
        double percent = 0;
        if (contributionSumm < 100_000) {
            percent = contributionSumm * 0.05;
        } else if (contributionSumm >= 100_000 && contributionSumm <= 300_000) {
            percent = contributionSumm * 0.07;
        } else if (contributionSumm > 300_000) {
            percent = contributionSumm * 0.1;
        }
        int totalSum = (int)(percent + contributionSumm);
        System.out.println("Сумма вклада составила: " + contributionSumm + "\nНачисленный процент: "
                + (int)percent + "\nИтоговая сумма с %: " + totalSum);

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

        System.out.println("\nЗадание 9: Подсчет количества банкнот;");
        int requireUsd = 567;
        int total100Usd = 10;
        int total10Usd = 5;
        int total1Usd = 50;
        int require100 = requireUsd / 100;
        int require10 = (requireUsd % 100) / 10;
        int require1 = (requireUsd % 10);
        int debt100 = 0;
        int debt10 = 0;
        int debt1 = 0;
        if ((total100Usd * 100) + (total10Usd * 10) + (total1Usd) >= requireUsd) {
            if (requireUsd / 100 <= total100Usd) {
                total100Usd = total100Usd - require100;
                System.out.println("Вам выдано банкнот 100 USD = " + require100);
            } else {
                System.out.println("Вам выдано банкнот 100 USD = " + total100Usd);
                debt100 = (total100Usd - require100);// -1
                total100Usd = 0;
            }
            if (require10 <= total10Usd + ((debt100))*10) {
                total10Usd = total10Usd - require10 + ((debt100)*10);
                System.out.println("Вам выдано банкнот 10 USD = " + require10);
            } else { 
                System.out.println("Вам выдано банкнот 10 USD = " + total10Usd);
                debt10 = total10Usd - require10;// -1
                total10Usd = 0;
            }
            if (require1 <= total1Usd) {
                total1Usd = total1Usd - require1 + ((debt10) * 10);
                System.out.println("Вам выдано банкнот 1 USD = " + (int)(require1 + (-(debt100)*100)
                         + (-(debt10) * 10)) );
                System.out.println("Выдаваемая сумма USD = " + requireUsd);
            }
        } else {
            System.out.println("В банкомате недостаточно денег");
        }
    }
}