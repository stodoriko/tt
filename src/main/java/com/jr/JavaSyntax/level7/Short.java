package com.jr.JavaSyntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую короткую строку в списке.
 * 4. Выведи найденную строку на экран.
 * 5. Если таких строк несколько, выведи каждую с новой строки.
 */

public class Short {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listAll = new ArrayList<>();
        ArrayList<String> listMin = new ArrayList<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String expression = bf.readLine();
            listAll.add(expression);
        }
        String expMinString = listAll.get(0);
        int expMinLength = listAll.get(0).length();

        for (String s : listAll) {
            if (expMinLength > s.length()) {
                expMinLength = s.length();
                expMinString = s;
            }
        }

        for (String s : listAll) {
            if (expMinString.length() == s.length()) {
                listMin.add(s);
            }
        }

        for (String s : listMin) {
            System.out.println(s);
        }
    }
}
