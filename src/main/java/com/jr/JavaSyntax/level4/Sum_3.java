package com.jr.JavaSyntax.level4;

import java.util.Scanner;

public class Sum_3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            } else {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}