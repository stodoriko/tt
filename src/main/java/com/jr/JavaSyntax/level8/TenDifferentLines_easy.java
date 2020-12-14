package com.jr.JavaSyntax.level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//      Требования:
//        •	Программа должна создавать переменную коллекции Map с типом элементов String, String. Переменная должна быть сразу проинициализирована.
//        •	Программа не должна считывать значения с клавиатуры.
//        •	Программа должна добавлять в коллекцию 10 различных строк, согласно условию.
//        •	Метод printKeys() должен выводить на экран список ключей коллекции, каждый элемент с новой строки.

public class TenDifferentLines_easy {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //создаётся итератор
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            System.out.println(pair.getKey());
        }
    }
}
