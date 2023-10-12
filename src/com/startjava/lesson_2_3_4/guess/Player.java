package com.startjava.lesson_2_3_4.guess;

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
        return numbers[attempt];
    }

    public void setNumber(int number) {
        numbers[attempt] = number;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
    
    public void getNumbers() {
        for (int x : numbers) {
            System.out.print(x !=0 ? x + " ": "");
        }
    }
}
