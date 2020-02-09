package com.tt.java_1.Scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        for (int i = 0; i < 2; i++) {

            int a = scanner.nextInt();
            System.out.println("Вы ввели число: " + a);

            int b = scanner.nextInt();
            System.out.println("Вы ввели число: " + b);

            System.out.println("Минимальное из " + a + " и " + b + " будет: " + compareInt(a, b));

            scanner.close();
        }
    }

    public static int compareInt(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }
}
