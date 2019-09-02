package com.tt.PrimitiveType;

public class Test {
    public static void main(String[] args) {
        float f = 123.2F; // нобходимо ставить в конце F, т.к. по умолчанию double
        long l = 1234451231232566L; // необходимо ставить L в конце, т.к. по умолчанию int

        /*
        int x = l; // так не получится сконвертировать long в int
        int x = (int)l; (явное приведение типов)
        */

        int b = 123;
        double c = b; // с целыми числами проблем нет
        double d = 123.5;
        int a = (int) d; // нельзя, т.к. можем потерять вещественную часть, поэтому в явном виде указываем тип


        double x = 22.2;
        long z = Math.round(x); // округлили
        System.out.println(z);


        byte s = (byte)128; // -128 до 127 Мы конвертируем int в byte
        System.out.println(s); // Превысили размер числового ряда и получили -128


    }
}
