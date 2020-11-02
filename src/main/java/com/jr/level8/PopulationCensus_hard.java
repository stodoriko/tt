package com.jr.level8;

/*     Требования:
        •	Программа не должна выводить текст на экран.
        •	Программа не должна считывать значения с клавиатуры.
        •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
        •	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
        •	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
 */

import java.util.HashMap;
import java.util.Map;

public class PopulationCensus_hard {
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int coincidencesFirstName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String firstName = pair.getValue();
            if (firstName.equals(name)) {
                coincidencesFirstName++;
            }
        }
        return coincidencesFirstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int coincidencesLastName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String firstName = pair.getKey();
            if (firstName.equals(lastName)) {
                coincidencesLastName++;
            }
        }
        return coincidencesLastName;
    }

    public static void main(String[] args) {
        Map<String, String> newMap = createMap();
        System.out.println(getCountTheSameFirstName(newMap, "Дмитрий"));
        System.out.println(getCountTheSameLastName(newMap, "Лоськов"));
    }
}
