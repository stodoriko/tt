package com.jr.level8;

import java.util.HashMap;
import java.util.Map;

/* Требования:
•	Программа должна выводить текст на экран.
•	Класс Solution должен содержать только три метода.
•	Метод createPeopleMap() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.
•	В методе createPeopleMap() должны добавляться люди с одинаковыми фамилиями.
•	В методе createPeopleMap() должны добавляться люди с одинаковыми именами.
•	Метод printPeopleMap() должен выводить на экран всех людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
•	Метод main() должен вызывать метод createPeopleMap().
•	Метод main() должен вызывать метод printPeopleMap().
 */

public class Namesakes_easy {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Ivanchenko","Maria");
        map.put("Popov","Valik");
        map.put("Lepeha","Andrey");
        map.put("Kuksa","Daria");
        map.put("Popov","Grisha");
        map.put("Popov","Semen");
        map.put("Obertiy","Daria");
        map.put("Kubasova","Kris");
        map.put("Gresko","Lisa");
        map.put("Perevertaylo","Daria");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
