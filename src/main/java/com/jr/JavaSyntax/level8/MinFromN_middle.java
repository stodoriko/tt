package com.jr.JavaSyntax.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
    Требования:
    •	Программа должна выводить текст на экран.
    •	Программа должна считывать значения с клавиатуры.
    •	Класс Solution должен содержать только три метода.
    •	Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
    •	Метод getMinimum() должен вернуть минимальное число среди элементов списка.
 */

public class MinFromN_middle {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // считываем значение с клавиатуры
        int n = Integer.parseInt(reader.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // внутри цикла нельзя модифицировать данные, поэтому в методе add используем конструкцию получения значения целиком
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
