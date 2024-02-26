package com.jr.JavaCore.level12;

//        Напиши метод, который определяет, какой объект в него передали.
//        Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
//
//        Примечание: постарайся определять тип животного как можно более точно.

public class Visitors {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        if (o.getClass().equals(Cat.class)) {
            return "Кот";
        } else if (o.getClass().equals(Tiger.class)) {
            return "Тигр";
        } else if (o.getClass().equals(Lion.class)) {
            return "Лев";
        } else if (o.getClass().equals(Bull.class)) {
            return "Бык";
        } else if (o.getClass().equals(Cow.class)) {
            return "Корова";
        } else {
            return "Животное";
        }
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
