package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[11];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[attempt];
    }

    public void addNumber(int number) {
        numbers[attempt] = number;
    }
    
    public int getAttemptNumber() {
        int attemptCopy = attempt;
        return attemptCopy + 1;
    }

    public void setAttemptNumber() {
        attempt++;
    }
    
    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}
