package com.jr.level8;

/*
Требования:
•	Программа не должна выводить текст на экран.
•	Класс Solution должен содержать только 5 методов.
•	Метод getListForGet должен возвращать список, который лучше всего подходит для операции взятия элемента.
•	Метод getListForSet должен возвращать список, который лучше всего подходит для установки значения элемента.
•	Метод getListForAddOrInsert должен возвращать список, который лучше всего подходит для операций добавления или вставки элемента.
•	Метод getListForRemove должен возвращать список, который лучше всего подходит для операции удаления элемента.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FourMethods_easy {

    public static List getListForGet() {
        return new ArrayList();
    }

    public static List getListForSet() {
        return new ArrayList();
    }

    public static List getListForAddOrInsert() {
        return new LinkedList();
    }

    public static List getListForRemove() {
        return new LinkedList();
    }

    public static void main(String[] args) {

    }
}
