package com.tt.java_1.Packages.Forest;

public class Tree {
    private String name;
    private int age;

    // конструктор публичный, чтобы иметь возможность создать объект в классе Main
    public Tree(String name, int age) {
        //обращаемся к переменным класса
        this.name = name;
        this.age = age;

        if (age > 95) {
            System.out.println("Деревцо пора на дрова");
        } else if (age < 95){
            System.out.println("Поживи ещё");
        } else {
            System.out.println("Возраст неизвестен");
        }
    }

    public Tree(int age) {
        System.out.println("Возраст = " + age);
    }
}
