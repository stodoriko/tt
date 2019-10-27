package com.tt.java_2.Collections.ArrayList;
import java.util.ArrayList;

public class ArrayL{
    public static void main(String[] args) {
        ArrayList<String> a = new java.util.ArrayList<>();
        a.add(0, "ноль");
        a.add(1, "один");
        a.add(2, "два");
        printAll(a);
        if (a.contains("два")) {
            a.add("три");
        }
        printAll(a);
        if (a.size() !=5) {
            a.add("четыре");
        }
        printAll(a);
        if (a.get(0).equals("ноль")) {
            a.remove(0);
        }
        printAll(a);

        while (!a.isEmpty()) {
            a.remove(a.size() - 1);
        }
        System.out.println(a.size());
        a.add("1");
        a.remove(0);
        printAll(a);

        for (int i = 0; i < 10; i++) {
            a.add("Строка " + i +";");
        }
        printAll(a);

        System.out.println("-----");
        a.clone();
        printAll(a);

        a.clear();
        System.out.println("-------");
        printAll(a);
    }

    public static void printAll(ArrayList<String> all) {
        for (String element : all) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
