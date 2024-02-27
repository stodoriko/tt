package com.jr.JavaSyntaxPro.lev6_arrays;

import java.util.Arrays;

public class IsExist {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        Arrays.sort(array);
        if (Arrays.binarySearch(array, element) == element) {
            System.out.println("true");
        }
    }
}
