package com.jr.JavaSyntax.level6;

/*
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfaName = reader.readLine();
        Cat catGrandfa = new Cat(grandfaName);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandma, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat parentM;
        private Cat parentF;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentM, Cat parentF) {
            this.name = name;
            this.parentM = parentM;
            this.parentF = parentF;

        }

        @Override
        public String toString() {
            if ((parentM == null)&&(parentF == null))
                return "The cat's name is " + name + ", no mother, no father ";
            else if(parentM == null)
                return "The cat's name is " + name + ", no mother, father is " + parentF.name;
            else if(parentF == null)
                return "The cat's name is " + name + ", mother is " + parentM.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + parentM.name + ", father is " + parentF.name;
        }
    }

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String motherName = reader.readLine();
//        Cat catMother = new Cat(motherName);
//
//        String daughterName = reader.readLine();
//        Cat catDaughter = new Cat(daughterName, catMother);
//
//        System.out.println(catMother);
//        System.out.println(catDaughter);
//    }
//
//    public static class Cat {
//        private String name;
//        private Cat parent;
//
//        Cat(String name) {
//            this.name = name;
//        }
//
//        Cat(String name, Cat parent) {
//            this.name = name;
//            this.parent = parent;
//        }
//
//        @Override
//        public String toString() {
//            if (parent == null)
//                return "The cat's name is " + name + ", no mother ";
//            else
//                return "The cat's name is " + name + ", mother is " + parent.name;
//        }
//    }
//
//}
