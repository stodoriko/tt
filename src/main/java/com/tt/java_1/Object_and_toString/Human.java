package com.tt.java_1.Object_and_toString;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределяем метод toString()
    public String toString() {
        return name + ", " + age;
    }
}
