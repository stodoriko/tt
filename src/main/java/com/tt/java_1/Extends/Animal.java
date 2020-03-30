package com.tt.java_1.Extends;

public class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void eating() {
        System.out.println("I am eating");
    }

    public void sleeping() {
        System.out.println("I am sleeping");
    }

    public String getName() {
        return name;
    }

}
