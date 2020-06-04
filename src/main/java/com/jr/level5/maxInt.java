package com.jr.level5;

//Написать программу, которая:
//        1. считывает с консоли число N, которое должно быть больше 0
//        2. потом считывает N чисел с консоли
//        3. выводит на экран максимальное из введенных N чисел.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maxInt {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        if (n <= 0) {

        } else {
            int k;
            int maximum = Integer.parseInt(bf.readLine());
            for (int i = 0; i < n - 1; i++) {
                k = Integer.parseInt(bf.readLine());
                if (k > maximum) {
                    maximum = k;
                }
            }
            System.out.println(maximum);
        }
    }
}




