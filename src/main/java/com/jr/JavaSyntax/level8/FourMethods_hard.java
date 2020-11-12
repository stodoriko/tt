package com.jr.JavaSyntax.level8;

/*
Требования:
•	Программа должна выводить число на экран.
•	Программа должна считывать значения с клавиатуры.
•	В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
•	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
•	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FourMethods_hard {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int iterator = 1;
        int size = 0;
        int count = 1;

        for (int i = 0; i < 10; i++) {
            Integer inputValue = Integer.parseInt(bf.readLine());
            list.add(inputValue);
            if (list.size() > 1) {
                // Если предыдущий и текущий элемент равны
                if (inputValue.equals(list.get(i - 1))) {
                    iterator++;
                    if (iterator > size) {
                        size = iterator;
                    }
                    // Если предыдущий и текущий элемент не равны
                } else if (!inputValue.equals(list.get(i - 1))) {
                    count++;
                    // Проверка на то, если все элементы в массиве разные
                    if (list.size() == count + 1) {
                        size = 1;
                    } else {
                        iterator = 1;
                    }
                }
            }
        }
        System.out.println(size);
    }
}
