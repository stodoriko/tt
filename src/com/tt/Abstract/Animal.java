package com.tt.Abstract;

public abstract class Animal {

    public void eat() {
        System.out.println("I am eating..");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public abstract void makeSound(); // т.к. метод абстрактный, то в классах наследниках необходима его реализация

}
