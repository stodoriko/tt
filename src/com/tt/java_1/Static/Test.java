package com.tt.java_1.Static;

public class Test {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
        System.out.println(human.getName());
        int ageHuman = human.getAge();
        System.out.println(ageHuman);

        Human human1 = new Human("Tod", 31);
        System.out.println(human1.getName());
        System.out.println(human1.getAge());

        Human.description = "Обращаемся к переменнной по имени класса";
        Human.getDescription();

        human.description = "Обращаемся к переменнной из объекта, но это тупость - так не делают";
        human.getDescription();
        Human.getDescription(); // изменили значение статической переменнной. Теперь хранит в себе последнее изменение.

        // просто проверил, что пременная description содержит последнее изменение и все новые объекты хранят это
        Human human2 = new Human();
        human.getDescription();
        Human.getDescription();
        System.out.println(" ------------- ");
        human2.printAllFields2();

        Human human3 = new Human("Vlad", 25);
        System.out.println(Human.getId());
        Human human4 = new Human("Ira", 18);
        System.out.println(Human.getId());
    }
}
