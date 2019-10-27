package com.tt.java_2.Collections.Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        // Нельзя удалять элементы в foreach, а только в while
        Iterator<Integer> iterator = list.iterator();

        int index = 0;
        // Before Java 5
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            if (index == 1) {
                iterator.remove();
            }
            index++;
        }
        System.out.println(list); // второй элемент отсутствует

        System.out.println("--------");

        // Java 5
        for (int x : list) {
            System.out.println(x);
        }
    }
}
