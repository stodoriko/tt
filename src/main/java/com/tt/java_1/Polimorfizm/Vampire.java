package com.tt.java_1.Polimorfizm;

public class Vampire extends Monster {
    boolean frighten(int x) {
        System.out.println("Укусить?");
        return false;
    }
}
