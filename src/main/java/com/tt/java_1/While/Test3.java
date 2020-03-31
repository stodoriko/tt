package com.tt.java_1.While;

public class Test3 {

//    Вывести на экран квадрат из 10х10 букв S используя цикл while.
//    Буквы в каждой строке не разделять.

    public static void main(String[] args) {
        String s = "S";
        int a = 10;

        while (a > 0) {
            int b = 10;
            while(b > 0) {
                System.out.print(s);
                b--;
            }
            a--;
            System.out.println();
        }
    }
}
