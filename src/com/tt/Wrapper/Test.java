package com.tt.Wrapper;

public class Test {
    public static void main(String[] args) {

        //Double, Float, Long, Integer, Short, Byte, Character, Boolean
        int x = 1;

        Integer y = new Integer(31); // Создание объекта типа Integer
        System.out.println(y.toString());
        System.out.println(Integer.parseInt("31"));

        // АВТОУПАКОВКА
        Integer x2 = 30;

        // АВТОРАСПАКОВКА
        int x3 = x2;

    }
}
