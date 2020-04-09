package com.tt.java_1.While;

public class Test4 {
    public static void main(String[] args) {

//        Вывести на экран таблицу умножения 10х10 используя цикл while.
//        Числа разделить пробелом.
        int a = 1;

        while (a < 11) {
            int b = 1;
            while (b < 11) {
                int c = a * b;
                System.out.print(c + " ");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}