package com.startjava.lesson_2_3_4.array;

//import com.sun.jdi.PathSearchingVirtualMachine;

public class ArrayMain {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {5.1f, .5f, 200.5f};
        System.out.println(numbers.length);
        System.out.println(numbers1.length);
//        System.out.println(numbers);
        for (float number : numbers1) {
            System.out.print(number + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < numbers1.length; i++) {
            numbers[i] = i * 10;
            System.out.print(numbers[i] + " ");
        }
//        System.out.println(numbers1[10]);
        String[] text = new String[3];
//        text -> array[adressHello |AdressJava | ]
//        "Hello" "Java"
        System.out.print("\n");
        for (String string : text)  {
            System.out.print(string + " ");
        }

        int[] cats = new int[6];
        cats[5] = 7;
        String result = String.valueOf(cats[5]);

        System.out.println("\n"+ result);

        String[] catsNames = {
                "Васька",
                "Кузя",
                "Барсик",
                "Мурзик",
                "Леопольд",
                "Бегемот",
                "Рыжик",
                "Матроскин"
        };
        System.out.println(catsNames[6]);
        System.out.println("catsNames.length = " + catsNames.length);

        int[] numbers2 = new int[5];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i * 10;
        }
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        String[] strings = new String[3];
        strings[0] = "hello";
        strings[1] = "good bye";
        strings[2] = "java";
        for (String string : strings) {
            System.out.println(string);
        }

        int[] numbers3 = {1, 2, 3};
        int sum = 0;
        for (int number : numbers3) {
            sum+=  number;
        }
        System.out.println("\nsum = " + sum);
        for (int i = 0; i < numbers3.length; i++) {
            sum+= numbers3[i];
        }
        System.out.println("\nsum = " + sum);

        int value = 0;
        String s = new String("abc");
        System.out.println("\n" + s);

    }
}
