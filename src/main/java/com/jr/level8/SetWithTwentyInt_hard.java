package com.jr.level8;

/*
Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Класс Solution должен содержать только три метода.
•	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
•	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetWithTwentyInt_hard {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
        return set;
    }


    public static void main(String[] args) {

    }
}
