package com.jr.JavaSyntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Int10 {
    public static void main(String[] args) throws IOException {
        // Создаём целочисленный массив с длинной указанной в параметре
        int[] array = initIntArray(10);
        // Вызываем статический метод для заполнения массива значениями введёнными с клавиатуры
        int[] arrayAfterFilling = arrayFilling(array);
        // Вызываем статический метод, который выводит на экран значения массива в обратной последовательности
        revertArray(arrayAfterFilling);
    }

    public static int[] initIntArray(int a) {
        return new int[a];
    }

    public static int[] arrayFilling(int[] array) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        return array;
    }

    public static void revertArray(int[] arrayAfterFilling) {
        for(int i = arrayAfterFilling.length; i > 0; i--) {
            System.out.println(arrayAfterFilling[i - 1]);
        }
    }
}
