package com.jr;

class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Sergey", 31);
    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
