package com.jr;

public class Cat {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.age = 12;
        cat1.weight = 4;
        cat1.strength = 4;

        Cat cat2 = new Cat();
        cat2.age = 11;
        cat2.weight = 3;
        cat2.strength = 3;


        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }

    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int first = 0;
        int second = 0;

        if (this.age > anotherCat.age) {
            first++;
        } else if (this.age < anotherCat.age) {
            second++;
        } else {
            first++;
            second++;
        }

        if (this.weight > anotherCat.weight) {
            first++;
        } else if (this.weight < anotherCat.weight) {
            second++;
        } else {
            first++;
            second++;
        }

        if (this.strength > anotherCat.strength) {
            first++;
        } else if (this.strength < anotherCat.strength) {
            second++;
        } else {
            first++;
            second++;
        }

        return (first>second);
    }
}


