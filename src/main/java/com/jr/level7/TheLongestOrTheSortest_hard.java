package com.jr.level7;

/*
        1. Создай список строк.
        2. Добавь в него 10 строчек с клавиатуры.
        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
        Если таких строк несколько, то должны быть учтены самые первые из них.
        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheLongestOrTheSortest_hard {
    public static void main(String[] args) throws IOException {

        ArrayList<String> arrayList = new ArrayList<>();
        String inputExpression;
        String shortString;
        String longString;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            inputExpression = bf.readLine();
            arrayList.add(inputExpression);
        }

        shortString = arrayList.get(0);
        longString = arrayList.get(0);

        for (String s : arrayList) {
            if (shortString.length() > s.length()) {
                shortString = s.toString();
            }

            if (longString.length() < s.length()) {
                longString = s.toString();
            }
        }

        for (String s : arrayList) {
            if (shortString.equals(s)) {
                System.out.println(s);
                break;
            } else if (longString.equals(s)) {
                System.out.println(s);
                break;
            }
        }
    }




}
