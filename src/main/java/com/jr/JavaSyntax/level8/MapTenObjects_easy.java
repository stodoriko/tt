package com.jr.JavaSyntax.level8;

import java.util.HashMap;
import java.util.Map;

//       Требования:
//        •	Программа должна создавать переменную коллекции Map с типом элементов String, Object. Переменная должна быть сразу проинициализирована.
//        •	Программа не должна считывать значения с клавиатуры.
//        •	Программа должна добавлять в коллекцию 10 различных объектов, согласно условию.
//        •	Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.

public class MapTenObjects_easy {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for (Map.Entry<String, Object> obj : map.entrySet()) {
            System.out.println(obj.getKey() + " - " + obj.getValue());
        }

    }
}
