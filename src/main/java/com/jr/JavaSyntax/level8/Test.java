package com.jr.JavaSyntax.level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("first", "Щербакова");
        map.put("second", "Тактамышева");
        map.put("third", "Трусова");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String,String> pair = iterator.next();
            String place = pair.getKey();
            String sureName = pair.getValue();
            System.out.println(sureName + " - " + place);
        }
    }
}
