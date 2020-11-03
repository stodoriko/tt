package com.jr.level8;

/*
    Требования:
    •	Программа не должна выводить текст на экран.
    •	Программа не должна считывать значения с клавиатуры.
    •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
    •	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
    •	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
 */

import java.util.*;

public class WeDontNeedRepetitions_hard {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Лоськов", "Дмитрий");
        map.put("Сенников", "Дмитрий");
        map.put("Сычёв", "Дмитрий");
        map.put("Измайлов", "Марат");
        map.put("Пашинин", "Олег");
        map.put("Лехкето", "Джейкоб");
        map.put("Пименов", "Руслан");
        map.put("Нигматуллин", "Руслан");
        map.put("Евсеев", "Вадим");
        map.put("Сёмин", "Юрий");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> listOfValues = new ArrayList<>();
        ArrayList<String> listOfEquals = new ArrayList<>();

        for (Map.Entry<String, String> it : map.entrySet()) {
            listOfValues.add(it.getValue());
        }
        for (int i = 0; i < listOfValues.size(); i++) {
            if (i > 0) {
                if (listOfValues.get(i).equals(listOfValues.get(i - 1))) {
                    listOfEquals.add(listOfValues.get(i));
                }
            }
            System.out.println(listOfEquals.size());
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
