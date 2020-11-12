package com.jr.JavaSyntax.level8;

/*
        Требования:
        •	Программа не должна выводить текст на экран.
        •	Программа не должна считывать значения с клавиатуры.
        •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
        •	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OnlyForRich_middle {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Лоськов", 100);
        map.put("Сенников", 1000);
        map.put("Сычёв", 499);
        map.put("Измайлов", 500);
        map.put("Пашинин", 5000);
        map.put("Лехкето", 670);
        map.put("Пименов", 930);
        map.put("Нигматуллин", 260);
        map.put("Евсеев", 770);
        map.put("Сёмин", 210);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            int value = pair.getValue();
            if (value < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}
