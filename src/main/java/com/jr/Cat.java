package com.jr;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

//    public boolean fight(Cat anotherCat) {
//        if (this.age < anotherCat.age) {
//
//        }
//
//
//     return
//    }



    public static void main(String[] args) {

        Cat cat1 = new Cat(5, 5, 5);
        Cat cat2 = new Cat(4, 5, 5);

//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat2.fight(cat1));
    }
}
