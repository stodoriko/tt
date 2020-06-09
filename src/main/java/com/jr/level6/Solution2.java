package com.jr.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
/*
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
 */

public class Solution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList list = new ArrayList();

        for (int i = 0; i < i + 1; i++) {
            // считываем строку
            String inputValue = reader.readLine();
            // добавляем значение в маccив, изменив строку на число
            list.add(Integer.parseInt(inputValue));
            // Если длина массива равняется 5, то сортируем значения из массива
            if (list.size() == 5) {
                Collections.sort(list);
                for (int j = 0; j < 5; j++) {
                    // Преопразуем число в стороку и выводим на экран по вострастанию
                    System.out.println(list.get(j).toString());
                }
                break;
            }
        }

    }
}
