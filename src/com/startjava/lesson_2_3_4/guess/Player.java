package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int attempt;
    private int wins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public int getWins() {
        return wins;
    }

    public boolean addNumber(int number) {
        if (number < 1 || number > 100) {
            System.out.print("\nВведенное число " + number + " не в диапазоне от 1 до 100");
            return true;
        }
        numbers[attempt++] = number;
        return false;
    }

    public int getAttempt() {
        return attempt;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void addWin() {
        wins++;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public void clearWins() {
        wins = 0;
    }
}
