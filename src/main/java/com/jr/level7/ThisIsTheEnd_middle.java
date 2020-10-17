package com.jr.level7;

//      Требования:
//        •	Объяви переменную типа список строк и сразу проинициализируй ee.
//        •	Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
//        •	Саму строку "end" не нужно добавлять в список.
//        •	Выведи список на экран, каждое значение с новой строки.
//        •	Используй цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ThisIsTheEnd_middle {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < i+1; i++) {
            String inputValue = br.readLine();
            if (!inputValue.contains("end")) {
                arrayList.add(inputValue);
                System.out.println(arrayList.get(i));
            } else {
                break;
            }
        }

//        System.out.println("Пользователь ввёл значение 'end'. Выполнение программы завершено.");

    }
}
