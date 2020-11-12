package com.jr.JavaSyntax.level8;

/*
Требования:
        •	Программа не должна выводить текст на экран.
        •	Программа не должна считывать значения с клавиатуры.
        •	Программа должна содержать только три метода.
        •	Метод createArrayList() должен создавать и возвращать список ArrayList.
        •	Метод createLinkedList() должен создавать и возвращать список LinkedList.
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList_easy {
    public static Object createArrayList() {
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public static Object createLinkedList() {
        LinkedList linkedList = new LinkedList();
        return linkedList;
    }

    public static void main(String[] args) {

    }
}
