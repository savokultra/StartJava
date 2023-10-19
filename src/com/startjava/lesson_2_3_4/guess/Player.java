package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[11];
    private int attempt = 1;
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[count];
    }

    public void addNumber(int number) {
        numbers[count] = number;
    }
    
    public int getAttemptNumber() {
        return attempt;
    }

    public void setAttemptNumber() {
        attempt++;
    }
    
    public void setCount() {
        count++;
    }
    
    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public void clear() {
        Arrays.fill(numbers, 0, count, 0);
        attempt = 0;
        count = 0;
    }
}
