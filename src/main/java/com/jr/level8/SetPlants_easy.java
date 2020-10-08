package com.jr.level8;

import java.util.HashSet;
import java.util.Set;

//      Требования:
//        •	Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
//        •	Программа не должна считывать строки с клавиатуры.
//        •	Программа должна добавлять в коллекцию 10 строк, согласно условию.
//        •	Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.

public class SetPlants_easy {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
