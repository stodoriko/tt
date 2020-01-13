package com.tt.java_1.Encapsulation;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(31);
        person.setName("");

        System.out.println(person.getAge());
    }
}
