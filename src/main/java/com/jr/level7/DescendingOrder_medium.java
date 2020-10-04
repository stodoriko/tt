package com.jr.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//      Требования:
//        •	Программа должна считывать 20 целых чисел с клавиатуры.
//        •	Программа должна выводить 20 чисел.
//        •	В классе Solution должен быть метод public static void sort(int[] array).
//        •	Метод main должен вызывать метод sort.
//        •	Метод sort должен сортировать переданный массив по убыванию.

public class DescendingOrder_medium {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        // узнаём длину массива
        int lengthArray = array.length;
        // узаём значение в последнем элементе массива
        int lastInt = array[lengthArray - 1];

        for (int i = 20; i > 0; i--) {
            for (int k = lengthArray - 1; k > 0; k--) {
                // Если предпоследний из двух сравниваемых элементов меньше чем последний, то меняем их местами
                if (array[k - 1] < array[k]) {
                    int t = array[k - 1];
                    array[k - 1] = array[k];
                    array[k] = t;
                    // Если предпоследний из двух сравниваемых элементов больше или равен чем последний, то оставляем их без изменения
                } else if (array[k - 1] >= array[k - 1]) {
                    continue;
                }
            }
        }
    }
}

