package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public void addNumber(int number) {
        numbers[attempt] = number;
    }

    public void setAttemptNumber() {
        attempt++;
    }
    
    public void getAttempts() {
        int[] numbersCopy;
        numbersCopy = Arrays.copyOf(numbers, attempt);
        System.out.print("\nПопытки игрока " + name);
        for (int x : numbersCopy) {
            System.out.print(" " + x);
        }
    }

    public void arrayReset() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}
