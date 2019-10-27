package com.tt.java_1.Modifiers.Package1;

public class Test {
    public static void main(String[] args) {

        //private пример
        Person person = new Person();
        //person.birthDay   -- доступа к полю нет, т.к. поле приватное, хоть они и в одном пакете.


        //protected пример
        System.out.println(person.gender); // в пределах пакета доступ есть
    }
}
