package com.startjava.lesson_2_3_4.person;

public class Person {
    
    String sex = "male";
    String name = "Petya";
    float height = 1.8f;
    float weight = 62.5f;
    int age = 200;
    
    void move() {
        System.out.println("moving");
    }
    
    void run() {
        System.out.println("runing");
    }
    
    String talk() {
        return "talking";
    }
    
    boolean learnJava() {
        return true;
    }
}
