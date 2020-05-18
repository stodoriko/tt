package com.jr.level6;

public class Scanner2 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(compareInt(a, b, c));

    }

    public static int compareInt(int a, int b, int c) {
        if ((a <= b) && (a <= c)) {
            return a;
        } else if ((b <= a) && (b <= c)) {
            return b;
        } else {
            return c;
        }

    }
}