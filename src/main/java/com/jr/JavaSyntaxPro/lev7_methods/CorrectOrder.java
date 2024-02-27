package com.jr.JavaSyntaxPro.lev7_methods;

/*
        Напишем утилиту для работы с массивами. Основная часть функционала готова: метод printArray() выводит в консоли все элементы массива.
        Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
        Метод должен работать только с массивами целочисленных значений (int[]).

        Пример:
        Если массив содержал элементы:
        1, 2, 3, 4, 5, 6, 7, 8, 9, 0
        то после вызова метода reverseArray() должен содержать:
        0, 9, 8, 7, 6, 5, 4, 3, 2, 1
 */

import java.util.Arrays;

public class CorrectOrder {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

//    public static void reverseArray(int[] array) {
//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = temp;
//        }
//    }


    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
