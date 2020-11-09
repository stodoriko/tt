package com.jr.level8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Требования:
•	Программа должна выводить текст на экран.
•	Внутри класса Solution должны быть созданы public static классы Cat, Dog.
•	Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
•	Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
•	Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
•	Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
•	Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.
 */

public class SetAllAnimals_hard {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("После объединения");
        System.out.println("=======================");

        removeCats(pets, cats);
        printPets(pets);
        System.out.println("После удаления");
        System.out.println("=======================");
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> unitedSet = new HashSet<>();
        //Объединил всех через новое множество<Объектов> питомцев, сначала котов — питомцы.добавитьВсё(коты); и также собак.

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            unitedSet.add(iterator.next());
        }

        Iterator<Dog> iterator2 = dogs.iterator();
        while (iterator2.hasNext()) {
            unitedSet.add(iterator2.next());
        }

        return unitedSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //Изъял всех котов одной строкой с помощью штатного метода: питомцы.удалитьВсё(коты);
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
