package com.jr.JavaSyntax.level7;

/*
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
3. Выведи результат на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай 10 строк с клавиатуры и добавь их в список.
•	Метод doubleValues должен удваивать элементы списка по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
•	Выведи получившийся список на экран, каждый элемент с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DoubleWords_middle {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        String inputValue;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            inputValue = bf.readLine();
            list.add(inputValue);
        }

        ArrayList<String> result = doubleValues(list);

        for (int k = 0; k < result.size(); k++) {
            System.out.println(result.get(k));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int j = 0; j < list.size(); j++) {
            // элемент с индексом 0 сдвигается вправо на одну позиции и становится в 1
            // считываем значение элемента 1 и добавляем его в 0
            list.add(j, list.get(j++));
        }
        return list;
    }
}
