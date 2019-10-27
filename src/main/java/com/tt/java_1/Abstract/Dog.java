package com.tt.java_1.Abstract;

public class Dog extends Animal implements OutherMethods{

    @Override
    public void jump() {
        System.out.println("Dog is jumping");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }
}
