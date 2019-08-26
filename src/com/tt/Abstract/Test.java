package com.tt.Abstract;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.jump();
        dog.eat();
        dog.sleep();


        System.out.println(" ------------- ");
        cat.makeSound();
        cat.sleep();
    }

    // дно из главных отличий абстрактных классов от интерфейсов в том, что объявляя метод в интерфейсе, мы обязуемся его реализовать
    // в классах реализующих интерфейс. А вот абстрактные классы, с неабстрактными методами этого не требуют.
}
