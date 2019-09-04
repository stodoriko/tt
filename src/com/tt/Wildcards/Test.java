package com.tt.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(1));
        listOfDogs.add(new Dog(2));

        test(listOfAnimal);
        test(listOfDogs);

    }


    public static void test(List<? extends Animal> listOfAnimal) {
        // List<?> - означает, что метод принимает лист любых объектов  // extends Animal - означает, либо Animal, либо любые наследники класса Animal  // super Animal - хотим видеть всех родителей класса Animal, т.е. Object
        for (Animal animal : listOfAnimal) {
            System.out.println(animal);
            animal.eat();
        }
    }
}
