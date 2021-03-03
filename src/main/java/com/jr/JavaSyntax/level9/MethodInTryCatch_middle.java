package com.jr.JavaSyntax.level9;

//        Написать программу, которая будет вводить числа с клавиатуры.
//        Код по чтению чисел с клавиатуры должен быть в методе readData.
//        Код внутри readData обернуть в try..catch.
//        Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
//        Числа выводить с новой строки сохраняя порядок ввода.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MethodInTryCatch_middle {
    public static void main(String[] args){
        readData();
    }

    public static void readData() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            try {
                int i = Integer.parseInt(bf.readLine());
                list.add(i);
            } catch (IOException | NumberFormatException e) {
                for (int i : list) {
                    System.out.println(i);
                }
                break;
            }
        }
    }
}
