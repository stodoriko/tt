package com.jr.JavaSyntaxPro.lev6_arrays;
/*
        Реализуй метод main(String[]), который делит массив array на два подмассива и заполняет ими двумерный массив result.
        Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
        Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.
        При тестировании значения полей класса Solution будут разными, учти это.
 */

import java.util.Arrays;

public class DivideArray {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int[] a = Arrays.copyOfRange(array, 0, 5);
        int[] b = Arrays.copyOfRange(array, 6, 10);
        result[0] = new int[a.length];
        result[1] = new int[b.length];

        for (int k = 0; k < a.length; k++) {

        }

        System.out.println(Arrays.deepToString(result));
    }
}
