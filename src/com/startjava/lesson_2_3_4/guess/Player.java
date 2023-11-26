package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private static final int ATTEMPTS = 10;
    private final String name;
    private final int[] numbers = new int[ATTEMPTS];
    private int attempt;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public boolean addNumber(int number) {
        if (number < START_RANGE || number > END_RANGE) {
            System.out.print("\nВведенное число " + number + " не в диапазоне от 1 до 100");
            return true;
        }
        numbers[attempt++] = number;
        return false;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public int getScore() {
        return score;
    }

    public void upScore() {
        score++;
    }

    public void clearScore() {
        score = 0;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}