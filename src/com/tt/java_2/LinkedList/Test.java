package com.tt.java_2.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // LinkedList - эффективен при удаление или добавление элементов в начало листа
        // ArrayList- эффективен при добавлении элементов в конец массива и считыванию элементо из массива

        /* т.к. класс LinkedList реализует один и тот же интерфейс, что и ArrayList, то созданному объекту доступны теже методы что и объекту ArrayList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.get(0);
        linkedList.size();
        linkedList.remove(0);
         */

        // LinkedList хранит в себе цепочку объектов head -> [0] -> [1] -> [2]
        List<Integer> linkedList = new LinkedList<>();
        // ArrayList хранит внутренний массив [0][1][2][3][4]
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);

    }

    public static void measureTime(List<Integer> list) {

        // получается, что добавление элементов в массив эффективнее делать с использованием arrayList
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        // здесь картина противоположная, уже сильно выигрывает linkedList
        for (int b = 0; b < 100000; b++) {
            list.add(0, b);
        }

        long start = System.currentTimeMillis();

        // здесь разница совсем огромная
        for (int a = 0; a < 100000; a++) {
            list.get(a);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
