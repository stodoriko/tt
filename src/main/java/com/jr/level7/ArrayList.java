package com.jr.level7;

public class ArrayList<S> {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
        System.out.println(list.size());
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}
