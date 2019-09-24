package com.tt.java_2.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

// interface Queue - реализует очередь. Тот элемент, который был помещён раньше других и доставаться будет первым (первым зашёл - первым вышел)
// Поток, который пришёл первым, должен первым получить доступ к освободившемуся ресурсу
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new LinkedList<>();
        people.add(person3);
        people.add(person4);
        people.add(person2);
        people.add(person1);

        for (Person person : people) {
            System.out.println(person);
        }


        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("cat");

        Queue<Animal> animalsAll = new ArrayBlockingQueue<>(10); // указываем размер
        animalsAll.add(animal1);
        animalsAll.add(animal2);
        System.out.println(animalsAll);
        animalsAll.remove(); // удаляем первый элемент из очереди
        System.out.println(animalsAll); // в очереди только второй элемент



    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
