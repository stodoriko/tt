package com.tt.java_1.This;

public class Human {
    String name;
    int age;

    public void setName(String name) {
        // this указывает, что обращаться надо к переменной класса. Если этого не сделать,
        // работать не будет, т.к. переменная метода будет присваиваиваться сама себе.
        // this.name - это тоже самое что и human.name
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name +" , "+ age);
    }
}
