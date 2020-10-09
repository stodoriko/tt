package com.jr.level8;

import com.google.common.collect.HashBiMap;

import java.util.HashMap;
import java.util.Map;

//      Требования:
//        •	Программа не должна считывать значения с клавиатуры.
//        •	В методе addCatsToMap() объяви переменную коллекции Map с типом элементов String, Cat и сразу проинициализируй ee.
//        •	Метод addCatsToMap() должен добавлять в коллекцию всех котов из массива String[] cats, согласно условию.
//        •	Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.

public class TenCatsInToMap {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> catMap = new HashMap<String, Cat>();
        for (String cat : cats) {
            Cat i = new Cat(cat);
            catMap.put(i.name, i);
        }
        return catMap;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
