package com.tt.java_2.Collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("frog");
        animals.add("tiger");
        animals.add("elephant");
        // по умолчанию cортирует в лексико-графическом порядке
        // можем передать второй аргумент, объект класса, который реализует интерфейс Comparator
        Collections.sort(animals, new StringLenghtComporator()); // теперь сртирует по длине
        System.out.println(animals);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(50);
        // по умолчанию сортировка по возрастанию
        Collections.sort(numbers, new BackwardsIntegerComporator());
        System.out.println(numbers);


        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Bob"));
        people.add(new Person(2, "Tod"));
        people.add(new Person(1, "Mike"));

        // сортируем по-возрастанию
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(people);

    }
}

class StringLenghtComporator implements Comparator<String> {

    // реализуем метод, который существует в интерфейсе
    @Override
    public int compare(String o1, String o2) {
        // если объект 1 больше объекта 2, то возвращается 1
        // если объект 1 меньше объекта 2, то возвращается -1
        // если объект 1 равен объекту 2, то возвращается 0
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwardsIntegerComporator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // сортировка по убыванию
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name ='" + name + '\'' +
                '}';
    }
}
