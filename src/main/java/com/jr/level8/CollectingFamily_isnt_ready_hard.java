package com.jr.level8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Требования:
•	Программа должна выводить текст на экран.
•	Класс Human должен содержать четыре поля.
•	Класс Human должен содержать один метод.
•	Класс Solution должен содержать один метод.
•	Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
 */

public class CollectingFamily_isnt_ready_hard {
    public static void main(String[] args) {
        ArrayList<String> children = new ArrayList<>();
        children.add("Egor");
        children.add("Sasha");
        children.add("Lena");
        Human children1 = new Human("Egor", true, 18);
        Human children2 = new Human("Igor", true, 19);
        Human children3 = new Human("Misha", true, 20);
        Human father = new Human("Vova", true, 45, new ArrayList<Human>(Arrays.asList(children1,children2,children3)));
        Human mother = new Human("Sveta", false, 42, new ArrayList<Human>(Arrays.asList(children1,children2, children3)));
        Human grandFather1 = new Human("Zhenya", true, 80, new ArrayList<Human>(Arrays.asList(father)));
        Human grandMother1 = new Human("Tonia", false, 80, new ArrayList<Human>(Arrays.asList(father)));
        Human grandFather2 = new Human("Slava", true, 80, new ArrayList<Human>(Arrays.asList(mother)));
        Human grandMother2 = new Human("Masha", false, 80, new ArrayList<Human>(Arrays.asList(mother)));
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(this.toString());
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            System.out.println(this.toString());
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
