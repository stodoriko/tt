package com.tt.java_1.Scanner;

public class Test3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] myArray = new int[4];
//
//        for (int i = 0; i < 4; i++) {
//            myArray[i] = scanner.nextInt();
//            System.out.println(myArray[i]);
//        }
        compareInt(4, 3, 5, 7);
    }


    public static int compareInt(int a, int b, int c, int d) {
        if (a <= b) {
            if ((a <= c) || (a <= d)) {
                System.out.println(a);
            }
            return a;

        } else if (b <= c) {
            if ((b <= a) || (b <= d)) {
                System.out.println(b);
            }
            return b;

        } else if (c <= d) {
            if ((c <= a) || (c <= d)) {
                System.out.println(c);
            }
            return c;

        } else {
            return d;
        }
    }

}


