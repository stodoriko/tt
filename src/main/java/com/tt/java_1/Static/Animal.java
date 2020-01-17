package com.tt.java_1.Static;

public class Animal {
    private String name;
    private int age;
    private double weight;
    private boolean healthy;
    String fullInformation;
    public static final String MAMMALS = "Вид: mammals";

    public Animal(String name, int age, double weight, boolean healthy) {
        if (name.equals("")) {
            this.name = "Имя не указано!";
        } else {
            this.name = name;
        }

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не указан. Присваивается " + age);
        }

        if (weight > 200) {
            System.out.println("Нафига такой здоровый?");
        } else {
            this.weight = weight;
        }

        if (!healthy) {
            System.out.println("Лечить срочно!");
        }

        fullInformation = "Имя: " + name + "; " +
                "Возраст: " + age + "; " +
                "Вес: " + weight + "; " +
                "Здоров " + healthy + "; ";

    }

    public String getInformationAboutAnimal() {
        return fullInformation;
    }
}
