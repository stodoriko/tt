package com.jr.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetsAndHouses {
    public static void main(String[] args) throws IOException {
        int[] ints = new int[15];
        int sumEven = 0;
        int sumOdd = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(bf.readLine());
            if (i % 2 == 0) {
                sumEven = sumEven + ints[i];
            } else {
                sumOdd = sumOdd + ints[i];
            }
        }
        System.out.println(sumEven > sumOdd ? "Количество жителей больше на чётной стороне:" + sumEven :
                "Количество жителей больше на нечётной стороне:" + sumOdd);
    }
}
