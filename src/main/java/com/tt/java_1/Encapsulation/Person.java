package com.tt.java_1.Encapsulation;

public class Person {

    private String name;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age <= 0) {
            System.out.println("Вы не указали возраст");
        } else if (age < 18) {
            System.out.println("Рано тебе, школоло");
        } else if (age > 85) {
            System.out.println("Может ну его и по чайку?");
        } else {
            this.age = age + 1;
            System.out.println("Добрый день, товарищ!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name.isEmpty()) {
            System.out.println("Вы не указали имени..");
            this.name = "Дебил";
            System.out.println("Введите Ваше имя, " + this.name);
        }
    }

    public Person() {
    }

}
