package com.jr.JavaSyntax.level10;

//Наша программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку), помещает их в HashMap и выводит на экран содержимое HashMap.
//        Нужно исправить программу так, чтобы она скомпилировалась.
//
//        Требования:
//        •	Программа должна считывать данные с клавиатуры.
//        •	Программа должна выводить текст на экран.
//        •	Класс Solution должен содержать три переменные.
//        •	Программа должна помещать в HashMap 10 пар (номер и строка), считанных с клавиатуры.
//        •	Программа должна выводить на экран содержимое HashMap. Каждое значение - с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMap_easy {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public HashMap_easy() {
        this.map = new HashMap<Integer, String>();
    }

    public static void main(String[] args) throws IOException {
        HashMap_easy hashMapEasy = new HashMap_easy();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            hashMapEasy.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : hashMapEasy.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}