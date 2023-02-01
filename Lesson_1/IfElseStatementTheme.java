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
                    '\n');
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
            System.out.println("Исходное число равно: " + a);
        }
    }
}
