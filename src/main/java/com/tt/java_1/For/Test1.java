package com.tt.java_1.For;

import java.util.Scanner;

//Ввести с клавиатуры два числа m и n.
//        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

public class Test1 {
    public static void main(String[] args) {
        int eight = 8;
        Scanner scanner = new Scanner(System.in);

        int[] inputValues = new int[2];
        for (int i = 0; i < inputValues.length; i++) {
            inputValues[i] = scanner.nextInt();
        }

        for (int a = 0; a < inputValues[0]; a++) {
            for (int b = 0; b < inputValues[1]; b++) {
                System.out.print(eight);
            }
            System.out.println("");
        }
    }
}