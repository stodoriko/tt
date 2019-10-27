package com.oreilly.Getter;

public class Test {
    public static void main(String[] args) {
        Getter getter = new Getter();
        int a = getter.calcArea(7, 12);
        short c = 7;
        getter.calcArea(c,57);
        // нельзя передавать только один аргумент
        // int d = getter.calcArea(57);
        getter.calcArea(2,3);
        long t = 42;
        // аргумент не подходит, т.к. в методе используется другой тип - int
        // int f = getter.calcArea(t,17);
        // без аргументов работать не будет
        // int g = getter.calcArea();
        // int в byte просто так нельзя, только если явно указать
        byte h = (byte) getter.calcArea(4, 20);
        System.out.println(h);
        // передаём большее аргументов, чем может принять метод
        // int j = getter.calcArea(2,3,5);

    }
}
