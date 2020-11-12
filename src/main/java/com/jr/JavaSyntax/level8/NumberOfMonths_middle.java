package com.jr.JavaSyntax.level8;
/*
    Требования:
    •	Программа должна считывать одно значение с клавиатуры.
    •	Программа должна выводить текст на экран.
    •	Программа должна использовать коллекции.
    •	Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NumberOfMonths_middle {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> monthMap = new HashMap<>();
        monthMap.put("January", 1);
        monthMap.put("February", 2);
        monthMap.put("March", 3);
        monthMap.put("April", 4);

        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("July", 7);
        monthMap.put("August", 8);

        monthMap.put("September", 9);
        monthMap.put("October", 10);
        monthMap.put("November", 11);
        monthMap.put("December", 12);

        // Запрашиваем у коллекции итератор
        Iterator<Map.Entry<String, Integer>> iterator = monthMap.entrySet().iterator();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = bf.readLine();

        // Проверяем, есть ли ещё объекты в последовательности
        while (iterator.hasNext()) {
            // Получаем следующий элемент последовательности вызовом метода next()
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals(inputValue)) {
                System.out.println(entry.getKey() + " is the " + entry.getValue() + " month");;
            }
        }
    }
}
