package com.jr.JavaSyntax;

public class Cat2 {
    String name = null;
    String color;
    String address = null;
    int weight;
    int age;


    public void initialize(String name) {
        this.name = name;
        this.color = "grey";
        this.weight = 4;
        this.age = 5;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Grey";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 6;
        this.color = "GreY";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 8;
        System.out.println(name);
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = age;
    }

    public static void main(String[] args) {
        Cat2 cat = new Cat2();
        cat.initialize(7, "grey");
    }

}
