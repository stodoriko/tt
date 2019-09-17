package com.tt.java_2.Collections;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        // пара ключ + значение
        Map<Integer, String> map = new java.util.HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        System.out.println(map.get(3));

        map.put(3, "Новое три");
        System.out.println(map.get(3));

        // Каждая пара ключ + значение - это Entry. Они не рассматриваются по отдельности, только вместе.
        // Получаем доступ к паре, параметризуем и даём имя entry, затем вызываем метод entrySet на нашей map, который возвращает набор всех пар
        // Затем получаем ключ и значение у каждой пары и выводим на экран
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
