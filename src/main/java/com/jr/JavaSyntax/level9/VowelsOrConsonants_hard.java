package com.jr.JavaSyntax.level9;

//        Написать программу, которая вводит с клавиатуры строку текста.
//        Программа должна вывести на экран две строки:
//        1. первая строка содержит только гласные буквы из введённой строки.
//        2. вторая - только согласные буквы и знаки препинания из введённой строки.
//        Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

//        Пример ввода:
//        Мама мыла раму.
//
//        Пример вывода:
//        а а ы а а у
//        М м м л р м .
//
//        Требования:
//        •	Программа должна считывать данные с клавиатуры.
//        •	Программа должна выводить две строки.
//        •	Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
//        •	Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
//        •	Каждая строка должна заканчиваться пробелом.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VowelsOrConsonants_hard {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = reader.readLine();
        while (inputValue.contains(" ")) {
            inputValue = inputValue.replace(" ", "");
        }

        char[] array = inputValue.toCharArray();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();
        for (Character c : array) {
            if (VowelsOrConsonants_hard.isVowel(c)) {
                vowel.add(c);
            } else {
                consonants.add(c);
            }
        }
        for (Character v : vowel) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (Character c : consonants) {
            System.out.print(c + " ");
        }


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
