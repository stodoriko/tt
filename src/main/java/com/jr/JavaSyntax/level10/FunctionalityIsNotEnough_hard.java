package com.jr.JavaSyntax.level10;

//Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
//        Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.
//
//        Ключевые требования:
//        Пустая строка - конец ввода данных.
//        Числа могут повторяться.
//        Строки всегда уникальны.
//        Введенные данные не должны потеряться!
//        Затем программа должна выводить содержание HashMap на экран.
//        Каждую пару - с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FunctionalityIsNotEnough_hard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String number = reader.readLine();
            if (number.isEmpty()) {
                break;
            }

            int id = Integer.parseInt(number);
            String name = reader.readLine();
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.println(value + " " + key);
        }
    }


//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        HashMap<String, Integer> map = new HashMap<>();
//        while (true) {
//            String number = reader.readLine();
//            if (number.isEmpty()) {
//                break;
//            }
//
//            int id = Integer.parseInt(number);
//            String name = reader.readLine();
//            map.put(name, id);
//        }
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getValue() + " " + entry.getKey());
//        }
//    }
}
