package com.tt.Static;

public class Human {

    private String name;
    private int age;
    public static String description; // переменная принадлежит классу
    private static int id;

    public Human() {
        this("Bob", 12);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        id++;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getId() {
        return id;
    }

    public static void getDescription() {
        System.out.println(description);
    }

    public static void printAllFields() {
        //System.out.println(description + name + age); Работать не будет, т.к. не статические переменные принадлежат объекту и у каждого объекта они могут быть разные,
        // Статический метод не знает к переменной какого объекта ему обращаться.
    }

    public void printAllFields2() {
        System.out.println(description + " " + name + " " + age);
    }
}
