package com.tt.java_2.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Sergei");
        hashSet.add("Irina");
        hashSet.add("Vlad");
        hashSet.add("Bob");
        hashSet.add("Tom");
        hashSet.add("Tom"); // Если дубль, то будет проигнорировано

        for (String name : hashSet) {
            System.out.println(name);
        }

        System.out.println("----------");
        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet);


    }
}
