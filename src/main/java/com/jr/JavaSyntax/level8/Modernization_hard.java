package com.jr.JavaSyntax.level8;

import io.cucumber.java.mn.Харин;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    Требования:
    •	Программа должна выводить текст на экран.
    •	Программа должна считывать значения с клавиатуры.
    •	Класс Solution должен содержать один метод.
    •	Программа должна вывести фамилию семьи по введенному городу.
 */

public class Modernization_hard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();

        while (map.size() < 3) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                System.out.println("Вы не указали город");
            }
            String family = reader.readLine();
            if (family.isEmpty()) {
                System.out.println("Вы не указали фамилию");
            }
            map.put(city, family);
        }


        String inputValue = reader.readLine();

        if (map.containsKey(inputValue)) {
            String familyName = map.get(inputValue);
            System.out.println(familyName);
        }
    }
}
