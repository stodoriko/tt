package com.jr.JavaSyntax.level7;

//Требования:
//        •	Объяви переменную типа список строк и сразу проинициализируй ee.
//        •	Считай 10 строк с клавиатуры и добавь их в список.
//        •	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
//        •	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OrderLinesCheck_medium {
    public static void main(String[] args) throws IOException {

        //        Объяви переменную типа список строк и сразу проинициализируй ee.
        ArrayList<String> list = new ArrayList<>();

        //        Считай 10 строк с клавиатуры и добавь их в список.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String inputValue = bf.readLine();
            list.add(inputValue);
        }

        //        Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
        for (int j = 0; j < list.size(); j++) {
            if (list.indexOf(list.get(j)) == list.size() - 1) {
                break;
            }
            if (list.get(j).length() < list.get(j + 1).length()) {

            } else {
                System.out.println(list.indexOf(list.get(j + 1)));
                break;
            }
        }
    }
}
