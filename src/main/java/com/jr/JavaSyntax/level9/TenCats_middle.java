package com.jr.JavaSyntax.level9;

import java.util.*;

//        Есть класс кот - Cat, с полем "имя" (String).
//        Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
//        Получить из Map множество(Set) всех котов и вывести его на экран.
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Метод createMap должен создавать новый объект HashMap<String, Cat>.
//        •	Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
//        •	Метод createMap должен возвращать созданный словарь.
//        •	Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
//        •	Программа должна вывести всех котов из множества на экран.

public class TenCats_middle {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> catsMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            catsMap.put("cat" + i, new Cat("Tom" + i));
        }
        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catsSet = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            catsSet.add(pair.getValue());
        }
        return catsSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}