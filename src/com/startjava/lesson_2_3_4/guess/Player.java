package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[11];
    private int attempt = 1;
    private int cell = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[cell];
    }

    public void addNumber(int number) {
        numbers[cell] = number;
    }
    
    public int getAttemptNumber() {
        return attempt;
    }

    public void setAttemptNumber() {
        attempt++;
    }
    
    public void setCell() {
        cell++;
    }
    
    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, cell + 1);
    }

    public void clear() {
        Arrays.fill(numbers, 0, cell, 0);
        attempt = 0;
        cell = 0;
    }
}
