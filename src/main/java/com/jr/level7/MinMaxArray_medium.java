package com.jr.level7;

//Требования:
//        •	В классе Solution создай статический публичный метод int[] getInts().
//        •	Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
//        •	В методе main создай и проициализируй массив с помощью метода getInts(), найди и выведи через пробел максимальный и минимальный элемент массива.
//        •	Используй цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinMaxArray_medium {
    public static void main(String[] args) throws IOException {

        int maximum;
        int minimum;

        // использование возвращённого значения
        int[] array = getInts();
        // сортировка с помощью класса Array
        Arrays.sort(array);
        maximum = array[19];
        minimum = array[0];


        System.out.print(maximum + " " + minimum);
    }

    // Создание метода и инициализация массива значениями с клавиатуры
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayList = new int[20];
        for (int i = 0; i < 20; i++) {
            arrayList[i] = Integer.parseInt(reader.readLine());
        }
        // возврат массива
        return arrayList;
    }
}
