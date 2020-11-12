package com.jr.JavaSyntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
        1. Создать массив на 20 чисел.
        2. Ввести в него значения с клавиатуры.
        3. Создать два массива на 10 чисел каждый.
        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

 */

public class Int20Int10Int10 {
    public static void main(String[] args) throws IOException {
        int[] ints = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(bf.readLine());
            if (i < 10) {
                small1[i] = ints[i];
            } else {
                small2[i-10] = ints[i];
                System.out.println(small2[i-10]);
            }
        }


    }
}
