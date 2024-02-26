package com.alghoritms;

import java.util.Random;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class BinarySearch {

    public static void main(String[] args) {
        int min = 0;
        int max = 99;
        int[] array = new int[max];

        int value  = (int) (Math.random() * max);
        System.out.println("Вы загадали число:" + value);

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int avg = (max + min) / 2;
        int count = 1;

        while (value != avg) {
            if (value < avg) {
                max = avg;
            } else {
                min = avg;
            }
            avg = (max + min) / 2;
            count++;
        }
        System.out.println("С " + count + " попытки найдено число: " + avg);
    }
}
