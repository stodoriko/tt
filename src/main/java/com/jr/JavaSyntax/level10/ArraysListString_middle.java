package com.jr.JavaSyntax.level10;

//Создай массив, элементами которого будут списки строк.
//        Заполни массив любыми данными и выведи их на экран.
//
//        Требования:
//        •	Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
//        •	Метод createList должен возвращать созданный массив.
//        •	Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
//        •	Программа должна выводить данные на экран.
//        •	Метод main должен вызывать метод createList.
//        •	Метод main должен вызывать метод printList.

import java.util.ArrayList;

public class ArraysListString_middle {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayList = new ArrayList[2];
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        arrayList[0] = arrayList1;

        arrayList2.add("1");
        arrayList2.add("2");
        arrayList2.add("3");
        arrayList[1] = arrayList2;

        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
