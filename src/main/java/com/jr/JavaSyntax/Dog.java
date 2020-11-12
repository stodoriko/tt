package com.jr.JavaSyntax;

public class Dog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Шарик");
        dog.setAge(4);
        System.out.println("Имя: " + dog.getName());
        System.out.println("Возраст: " + dog.getAge());
    }

    private int age;
    private String name;

    public void setName(String name) {
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

}
