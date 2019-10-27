package com.tt.java_1.Downcasting_and_upcasting;

public class Test {
    public static void main(String[] args) throws ClassCastException {

        // Восходящее(upcasting) преобразование(Происходит явно, от потомка к родителю)
        Animal animal = new Dog();
        animal.eat();

        Dog dog = new Dog();
        Animal animal1 = dog; // Собака стала животным. Ушла вверх по иерархи наследования
        animal1.eat(); // доступны только методы животного


        // Нисходящее(downcasting) преобразование(Происходит неявно, от родителя к потомку)
        try {
            Animal animal2 = new Animal();
            Dog dog2 = (Dog) animal2; // необходимо явно указать тип. Спустились вниз по иерархии наследования
            dog2.eat(); // Влад, почему тут не вызывается метод животного?
            dog2.bark(); // не сработает, т.к. наш объект это Animal
        } catch (ClassCastException e) {
            System.out.println("У животного нет собачьих методов!");
        }

    }
}

