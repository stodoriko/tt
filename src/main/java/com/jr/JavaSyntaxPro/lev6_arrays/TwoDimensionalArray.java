package com.jr.JavaSyntaxPro.lev6_arrays;

/*
Для этого реализуй метод main(String[]), который:

        1. Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
        2. Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
        3. Инициализирует двумерный массив multiArray:
           количеством строк N;
           строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).

           Пример:
            Введено число 5.
            Введены числа 1, 7, 5, 9, 3.
            Получаем такой массив:
            []
            [][][][][][][]
            [][][][][]
            [][][][][][][][][]
            [][][]
 */

import java.util.Scanner;

public class TwoDimensionalArray {

    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstN = scanner.nextInt();

        multiArray = new int[firstN][];

        for (int i = 0; i < multiArray.length; i++) {
            int secondN = scanner.nextInt();
            multiArray[i] = new int[secondN];
        }
    }
}
