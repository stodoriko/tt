package com.tt.java_1.Scanner;

import java.util.Scanner;

public class Test9 {

//    Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] inputValues = new int[3];
        int inputPlus = 0;

        for (int i = 0; i < inputValues.length; i++) {
            inputValues[i] = scanner.nextInt();
            if (inputValues[i] > 0) {
                inputPlus++;
            } else {
            }
        }
        System.out.println(Integer.valueOf(inputPlus));

    }
}
