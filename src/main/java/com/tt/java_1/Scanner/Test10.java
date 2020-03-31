package com.tt.java_1.Scanner;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] inputValues = new int[3];
        int inputPlus = 0;
        int inputMinus = 0;

        for (int i = 0; i < inputValues.length; i++) {
            inputValues[i] = scanner.nextInt();
            if (inputValues[i] > 0) {
                inputPlus++;
            } else if (inputValues[i] < 0) {
                inputMinus++;
            } else {

            }
        }
        System.out.println("количество отрицательных чисел: " + inputMinus);
        System.out.println("количество положительных чисел: " + inputPlus);
    }

}
