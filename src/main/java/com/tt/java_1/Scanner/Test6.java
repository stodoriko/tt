package com.tt.java_1.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = scanner.nextInt();
        }

        Arrays.sort(input);
//Выводим отсортированный массив на консоль.
        for (int i = 2; i >= 0; i--) {
            System.out.println(input[i] + "  ");
        }
    }
}
