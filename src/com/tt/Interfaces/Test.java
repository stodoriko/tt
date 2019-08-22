package com.tt.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");

        animal.sleep();
        person.sayHello();
        animal.showInfo();
        person.showInfo();
        System.out.println("------------");

        // так можно делать, т.к. классы Animal и Person реализуют интерфейс Info
        // можем вызвать только метод, который описан в интерфейсе. Это полиморфизм.
        Info info1 = new Animal(2);
        Info info2 = new Person("Tod");
        info1.showInfo();
        info2.showInfo();
        System.out.println("------------");


        outputInfo(info1);
        outputInfo(info2);

        // можем в аргументы метода передавать объекты класса Animal и Person
        Animal animal2 = new Animal(3);
        Person person2 = new Person("Vlad");
        outputInfo(animal2);
        outputInfo(person2);
    }

    // Этот метод принимает на вход нечто, что реализует интерфейс Info
    //(будет рабаотать, если в интрефейсе сделать метод статичным)
    public static void outputInfo (Info info) {
//        Info.showInfo();
    }

}
