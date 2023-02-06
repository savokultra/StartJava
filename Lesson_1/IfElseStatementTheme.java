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
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 1;
        int programmingGrade = 2;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent < 74) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent < 92) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent < 74) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent < 92) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        int averagePoint = (historyGrade + programmingGrade) / 2;
        int averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println(historyGrade + ": оценка по истории\n" + programmingGrade + 
                ": оценка по программированию");
        System.out.println("Средний балл оценок по предметам:" + averagePoint);
        System.out.println("Средний процент по предметам:" + averagePercent);

        System.out.println("\nЗадание 8: Расчет прибыли за год;");
        int rent = 5000;
        int sales = 13000;
        int price = 9000;
        int yearDividend = (sales - price - rent) * 12;
        if (yearDividend > 0) {
            System.out.print("Прибыль за год: " + yearDividend + " рублей");
        } else {
            System.out.println("Убыток за год: " + yearDividend + " рублей");
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
                debt100 = (total100Usd - require100);
                total100Usd = 0;
            }
            if (require10 <= total10Usd + ((debt100))*10) {
                total10Usd = total10Usd - require10 + ((debt100)*10);
                System.out.println("Вам выдано банкнот 10 USD = " + require10);
            } else { 
                System.out.println("Вам выдано банкнот 10 USD = " + total10Usd);
                debt10 = total10Usd - require10;
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