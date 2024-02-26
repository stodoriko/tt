package com.jr.JavaSyntaxPro.lev6_arrays;
/*
Требования:
        •	В методе main(String[]) двумерный массив result заполни числами согласно условию.
        •	Выведенный текст должен содержать 10 строк.
        •	Выведенные числа должны соответствовать условию.
 */

public class TriangularArray {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i+1];
            for (int k = 0; k < i + 1; k++) {
                result[i][k] = i + k;
                System.out.print(result[i][k] + " " );
            }
            System.out.println();
        }
    }
}
