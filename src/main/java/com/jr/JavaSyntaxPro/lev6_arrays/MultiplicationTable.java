package com.jr.JavaSyntaxPro.lev6_arrays;

/*
Требования:
        •	В методе main массив MULTIPLICATION_TABLE должен быть заполнен таблицей умножения.
        •	Выведенный текст должен содержать 10 строк.
        •	Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
        •	Выведенные числа должны быть таблицей умножения.

        1 2 3 4 …
        2 4 6 8 …
        3 6 9 12 …
        4 8 12 16 …
…
 */

public class MultiplicationTable {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(MULTIPLICATION_TABLE[row][col] = (row + 1) * (col + 1));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
