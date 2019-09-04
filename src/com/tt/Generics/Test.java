package com.tt.Generics;

import com.tt.Polimorfizm.Animal;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ///////// JAVA 5 //////////
        List list = new ArrayList();
        Animal animal = new Animal();
        list.add("cat");
        list.add("dog");
        list.add("frog");
        list.add(animal); // т.к. ArrayList это имеет тип Object

        String string = (String)list.get(0); // так было до java 5
        System.out.println(string);


        /////////// С появлением дженериков /////////////
        List<String> list1 = new ArrayList<String>();
        list1.add("cat");
        list1.add("dog");
        list1.add("frog");
        // list1.add(animal); а вот тут уже нельзя, т.к. был выполнен downcasting

        String string2 = list1.get(1);
        System.out.println(string2);


        /////////// JAVA 7 ////////////
        List<String> list2 = new ArrayList<>();
    }
}
