package com.tt.java_1.While;

import java.util.Scanner;

public class Test6 {

//    Ввести с клавиатуры три числа, вывести на экран среднее из них.
//    Т.е. не самое большое и не самое маленькое.
//    Если все числа равны, вывести любое из них.

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[] values = new int[3];


        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        int max = Math.max(Math.max(values[0], values[1]), values[2]);
        int min = Math.min(Math.min(values[0], values[1]), values[2]);
        int sum = values[0] + values[1] + values[2];

        int average = sum - (max + min);
        System.out.println(average);
    }

}
