package com.tt.java_1.Abstract;

public class Cat extends Animal implements OutherMethods{

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Cat is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    @Override
    public void dance() {

    }

}
