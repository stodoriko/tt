package com.tt.java_1.Wildcards;

public class Dog extends Animal {

    private int id;

    public  Dog(int id) {
        this.id = id;
    }

    public String toString() {
        return String.valueOf(id);
    }
}
