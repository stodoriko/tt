package com.jr.JavaSyntax.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Требования:
        •	Программа должна выводить текст на экран.
        •	Программа должна считывать строку с клавиатуры.
        •	Программа должна заменять в тексте первые буквы всех слов на заглавные.
 */

public class WashingOfTheFrame_hard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = reader.readLine();

        String result = "";
        char[] chars = inputValue.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = (i == 0 || chars[i - 1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
            result = result + character;
        }
        System.out.println(result);
    }
}
