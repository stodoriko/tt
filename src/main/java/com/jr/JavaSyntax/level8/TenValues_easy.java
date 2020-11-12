package com.jr.JavaSyntax.level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TenValues_easy {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Lokomotiv", "Champion");
        map.put("Zenit", "Second");
        map.put("Spartak", "Third");

        printValue(map);
    }

    public static void printValue(Map<String, String> map) {
        Iterator <Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            System.out.println(pair.getValue());
        }
    }
}
