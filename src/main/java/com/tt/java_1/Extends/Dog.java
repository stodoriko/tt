package com.tt.java_1.Extends;

public class Dog extends Animal {

    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        if (this.name.equals("Dog")) {
            System.out.println("New name is " + name);
        }
        switch (age) {
            case 1 :
                System.out.println("тяф-тяф ");
                break;
            case 2 :
                System.out.println("гав-гав");
                break;
            case 3 :
                System.out.println("фув-фув");
                break;
            case 0 :
                System.out.println("Age is empty!");
                break;
        }
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    @Override
    public void sleeping() {
        System.out.println(name + " is sleeping");
    }
}
