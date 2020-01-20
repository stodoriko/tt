package com.tt.java_1.Interfaces;

public class Animal implements Info { // класс может реализовывать несколько интерфейсов -- implements Info, ..., ... {}
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleeping!");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
