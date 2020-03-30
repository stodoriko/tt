package com.tt.java_1.Abstract;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.jump();
        dog.eat();
        dog.sleep();
        dog.dance();


        System.out.println(" ------------- ");
        cat.makeSound();
        cat.sleep();
    }

    // Одно из главных отличий абстрактных классов от интерфейсов в том, что объявляя метод в интерфейсе, мы обязуемся его реализовать
    // в классах реализующих интерфейс. А вот абстрактные классы, с неабстрактными методами этого не требуют.
}
