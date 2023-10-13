package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempt;
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[attempt];
    }

    public void setNumber(int number) {
        numbers[attempt] = number;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
    
    public void getNumbers() {
        int[] numbersCopy;
        numbersCopy = Arrays.copyOf(numbers, attempt);
        for (int x : numbersCopy) {
            System.out.print(x != 0 ? x + " " : "");
        }
    }

    public void arraysFill() {
        Arrays.fill(numbers, 0);
    }
}
