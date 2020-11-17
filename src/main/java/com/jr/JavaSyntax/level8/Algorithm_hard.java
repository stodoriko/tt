package com.jr.JavaSyntax.level8;

/*
Требования:
        •	Программа должна выводить текст на экран.
        •	Программа должна считывать значения с клавиатуры.
        •	Класс Solution должен содержать три метода.
        •	Метод main() должен вызывать метод sort().
        •	Метод sort() должен вызывать метод isGreaterThan().
        •	Выведенные слова должны быть отсортированы в алфавитном порядке.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Algorithm_hard {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        isGreaterThan (array[0],array[1]);
        Arrays.sort(array);
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
