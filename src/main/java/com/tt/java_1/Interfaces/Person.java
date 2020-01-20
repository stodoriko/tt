package com.tt.java_1.Interfaces;

public class Person implements Info {
    private String name;
    private int salary;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }

    @Override
    public int getSalary() {
        System.out.println(name + " - " + salary);
        return salary;
    }
}
