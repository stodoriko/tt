package com.tt.java_1.For;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] inputValues = new int[3];

        String name = scanner.nextLine();
        for (int i = 0; i < inputValues.length; i++) {
            inputValues[i] = scanner.nextInt();
        }
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + inputValues[0] + "." + inputValues[1] + "." + inputValues[2]);
    }
}

