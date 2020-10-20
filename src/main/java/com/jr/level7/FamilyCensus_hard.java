package com.jr.level7;

//      Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
//        •	Добавить в класс конструктор public Human(String name, boolean sex, int age).
//        •	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
//        •	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
//        •	Выведи созданные объекты на экран.

public class FamilyCensus_hard {
    public static void main(String[] args) {
        Human gm1 = new Human("Katy", false, 65);
        System.out.println(gm1.toString());
        Human gm2 = new Human("Dora", false, 62);
        System.out.println(gm2.toString());
        Human gf1 = new Human("Kim", true, 65);
        System.out.println(gf1.toString());
        Human gf2 = new Human("Andrew", true, 58);
        System.out.println(gf2.toString());
        Human f = new Human("Stiv", true, 28, gf1, gm1);
        System.out.println(f.toString());
        Human m = new Human("Olga", false, 28, gf2, gm2);
        System.out.println(m.toString());
        Human c1 = new Human("Sam", true, 6, f, m);
        System.out.println(c1.toString());
        Human c2 = new Human("Alice", false, 5, f, m);
        System.out.println(c2.toString());
        Human c3 = new Human("Sara", false, 4, f, m);
        System.out.println(c3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
