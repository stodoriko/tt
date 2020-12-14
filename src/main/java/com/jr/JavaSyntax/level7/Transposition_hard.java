package com.jr.JavaSyntax.level7;
//      Требования:
//        •	Объяви переменную типа список строк и сразу проинициализируй ee.
//        •	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
//        •	Переставить M первых строк в конец списка.
//        •	Выведи список на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Transposition_hard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();
        int n = 0;
        int m = 0;

        for (int i = 0; i < 2; i++) {
            int inputValue = Integer.parseInt(reader.readLine());
            if (i == 0) {
                n = inputValue;
            } else {
                m = inputValue;
            }
        }

        for (int k = 0; k < n; k++) {
            arrayList.add(k, reader.readLine());
        }

        for (int j = 0; j < m; j++) {
            int i = 0;
            int arrayLength = arrayList.size();
            String t = arrayList.get(i);
            arrayList.remove(i);
            arrayList.add(arrayLength - 1, t);
        }

        int arrayLength = arrayList.size();

        for (int l = 0; l < arrayLength; l++) {
            System.out.println(arrayList.get(l));
        }
    }

}
