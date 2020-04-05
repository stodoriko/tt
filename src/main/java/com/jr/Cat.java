package com.jr;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public int fight(Cat anotherCat) {
     return anotherCat.age;
    }



    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
