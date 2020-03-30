package com.tt.java_1.Extends;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.eating();
        animal.sleeping();
//        I am eating
//        I am sleeping
        System.out.println(animal.getName());

        System.out.println("--------------------------");

        Dog dog = new Dog("Dog", 0);
        System.out.println(dog.getName());

        dog.bark();
        dog.sleeping();

    }
}
