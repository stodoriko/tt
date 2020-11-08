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

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> pair = it.next();
            listOfValues.add(pair.getValue());
        }
        for (int k = 0; k < listOfValues.size(); k++) {
            System.out.println(listOfValues.get(k));
        }
        System.out.println("========================");
        int s = 0;

        for (int i = s; i < listOfValues.size(); i++) {
            System.out.println("итерация: " + i + " Сравнение с именем: " + listOfValues.get(i));
            for (int l = i+1; l < listOfValues.size(); l++) {
                System.out.println("Сравниваем " + listOfValues.get(i) + " и " + listOfValues.get(l));
                if (listOfValues.get(i).equals(listOfValues.get(l))) {
                    listOfEquals.add(listOfValues.get(i));
                    System.out.println("Удалён элемент с именем " + listOfValues.get(l));
                    listOfValues.remove(l);
                }
            }
            System.out.println("Удалён элемент с именем " + listOfValues.get(i));
            listOfValues.remove(i);
            i--;
        }

        System.out.println("=======================");

        for (int j = 0; j < listOfEquals.size(); j++) {
            System.out.println(listOfEquals.get(j));
        }
        System.out.println(map.size());
        System.out.println("=======================");


        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, String> pair = it2.next();
            for (int h = 0; h < listOfEquals.size(); h++) {
                if (pair.getValue().equals(listOfEquals.get(h))) {
                    it2.remove();
                    System.out.println(map.size());
                }
            }
        }

        Iterator<Map.Entry<String, String>> it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<String, String> pair = it3.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }



        removeItemFromMapByValue(createMap(), listOfEquals.get(0));
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
