package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;


    private String names[] = new String[3];


    private int[] numbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }



    public Player(String gamers[]) {
        names = gamers;
    }



    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public void addNumber(int number) {
        numbers[attempt++] = number;
    }
    
    public int getAttemptNumber() {
        return attempt;
    }
    
    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}
