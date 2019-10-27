package com.tt.java_2.Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        // Внутри не гарантируется никакого порядка
        Map<Integer, String> hashMap = new HashMap<>();

        // В каком порядке пары(ключ + значение) были добавлены в таком порядке они и вернутся
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Пары(клбч + значение) сортируются по ключу (естественный порядк)
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(1, "Sergei");
        map.put(2, "Irina");
        map.put(4, "Vlad");
        map.put(3, "Bob");
        map.put(98, "Tom");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("------------");
    }
}
