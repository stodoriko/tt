package com.tt.Nested;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        // Создали объект класса Battery
        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
