package com.jr.level8;

/*
    Требования:
    •	Программа должна выводить числа на экран.
    •	Программа должна считывать значения с клавиатуры.
    •	Класс Solution должен содержать два метода.
    •	Метод sort() должен сортировать массив чисел от большего к меньшему.
    •	Метод main() должен вызывать метод sort().
    •	Программа должна выводить пять наибольших чисел массива. Каждое значение с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiveWinners_middle {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                a++;
            }
            for (int l = a; l < array.length; l++) {
                if (array[l] > array[i]) {
                    int more = array[l];
                    int less = array[i];
                    array[i] = more;
                    array[l] = less;
                }
            }
        }
    }
}
