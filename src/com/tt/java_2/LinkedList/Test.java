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

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);

    }

    public static void measureTime(List<Integer> list) {

        long start = System.currentTimeMillis();

        // добавление в конец листа в LinkedList --    head -> [5] -> [1] -> [2] -> [3] -> [4] не хранится массив, а хранится цепочка объектов(узлы)
        // добавление в конец листа в ArrayList -- [1][2][3][4][5][6], просто добавляется элмент в конец массива
        // получается, что добавление элементов в массив эффективнее делать с использованием ArrayList
//        for (int i = 0; i < 100000; i++) {
//            list.add(i);
//        }

        // добавление новых элементов в начало листа в LinkedList [] -> [1][0] -> [2][1][0] -> [3][2][1][0]
        // добавление новых элементов в начало листа в ArrayList -- [6][1][2][3][4][5], занимает много врмени, т.к. все элементы массива сдвигаются вправо
        // здесь картина противоположная, уже сильно выигрывает linkedList
        for (int b = 0; b < 100000; b++) {
            list.add(0, b);
        }


        // получение из конца массива
        // и получать значения из массива эффективнее из ArrayList, т.к. по LinkedList необходимо пройти по всей цепочке объектов
//        for (int a = 0; a < 100000; a++) {
//            list.get(a);
//        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
