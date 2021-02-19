package com.jr.JavaSyntax.level9;

//    Требования:
//        •	В классе должен быть метод public static void divideByZero().
//        •	Метод divideByZero должен содержать операцию деления любого целого числа на ноль.
//        •	Метод divideByZero должен вызывать System.out.println или System.out.print.
//        •	Метод main должен содержать блок try..catch.
//        •	Метод main должен отлавливать любые исключения метода divideByZero.
//        •	Программа должна выводить стек-трейс пойманого исключения.

public class DivideByZero_easy {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception a) {
            a.printStackTrace();
        }
    }

    public static void divideByZero() {
        int result = 1 / 0;
        System.out.println(result);
    }
}
