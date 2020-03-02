package com.tt.java_1.Scanner;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println(a);

        int b = scanner.nextInt();
        System.out.println(b);

        System.out.println(Math.min(a, b));

    }
}
