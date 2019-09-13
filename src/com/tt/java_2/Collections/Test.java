package com.tt.java_2.Collections;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
     // Получаем ArrayIndexOutOfBoundsException
//        int[] x = new int[3];
//
//        for (int i = 0; i < 4; i++) {
//            x[i] = 1;
//            System.out.println(x[i]);
//        }

        // Создаём два массива класса ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        // Конвенция рекумендует ссылать создаваемые объекты на переменную интерфейса List
        // List<Integer> arrayList2 = new ArrayList<>();

        // В первый массив добавляем 10 элементов
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        // В второй массив добавляем 10 элементов
        for (int i = 0; i < 11; i++) {
            arrayList2.add(i);
        }

        System.out.print(arrayList); // смотрим содержимое листа
        System.out.println(" ");
        System.out.println(arrayList.size()); // получаем размер
        System.out.println(arrayList.remove(2)); // удаляем 3 элемент
        System.out.print(arrayList); // смотрим содержимое листа
        System.out.println(" ");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2)); // получаем 3 элемент

        // в цикле получаем значения всех элементов массива(способ 1)
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.print(arrayList2.get(i));
        }
        System.out.println(" ");

        // в цикле получаем значения всех элементов массива(способ 2)
        for (int x : arrayList2) {
            System.out.print(arrayList2.get(x));
        }
    }
}
