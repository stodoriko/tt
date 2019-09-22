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

        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();

        hashSet.add("Sergei");
        hashSet.add("Irina");
        hashSet.add("Vlad");
        hashSet.add("Bob");
        hashSet.add("Tom");
        hashSet.add("Tom"); // Если дубль, то будет проигнорировано, т.к. в Set не может быть дубликатов

        linkedHashSet.add("Sergei");
        linkedHashSet.add("Irina");
        linkedHashSet.add("Vlad");
        linkedHashSet.add("Bob");
        linkedHashSet.add("Tom");
        linkedHashSet.add("Tom"); // Если дубль, то будет проигнорировано

        treeSet.add("Sergei");
        treeSet.add("Irina");
        treeSet.add("Vlad");
        treeSet.add("Bob");
        treeSet.add("Tom");
        treeSet.add("Tom"); // Если дубль, то будет проигнорировано

        for (String name : hashSet) {
            System.out.println(name);
        }

        System.out.println("----------");

        for (String name : linkedHashSet) {
            System.out.println(name);
        }

        System.out.println("----------");

        for (String name : treeSet) {
            System.out.println(name);
        }

        System.out.println("----------");
        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet);

        // Set theory

            //union - объеденение множеств
        hashSet1.add(0);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);

        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);
        hashSet2.add(8);

        Set<Integer> union = new HashSet<>(hashSet1); // принимает на вход существующее множество hashSet1 и строит новое множество
        union.addAll(hashSet2); // union содержит числа из hashSet1
        System.out.println(union); // 0,1,2 взялись из первого множества, остальные - из второго

            // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2); // retainAll оставляет все элементы из сета 1, которые есть в сете 2(пересечение двух множеств)
        System.out.println(intersection);

            // diffrence - разность множест
        Set<Integer> diffrence = new HashSet<>(hashSet1);
        diffrence.removeAll(hashSet2); // removeAll из сета, который в самом начале, вычитаются элементы из сета, который передаётся в качестве аргумента
        System.out.println(diffrence);

    }

}
