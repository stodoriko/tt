package com.tt.Polimorfizm;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat(); // т.к. класс Dog наследуется от Animal, то и экземляру дога доступен метод родителя

        Animal animal2 = new Dog();
//        animal.bark -- не работает, т.к. родительский тип ничего не знает о методе дочернего класса

        Dog dog2 = new Dog();
        dog2.eat();
        dog2.bark(); // а вот здесь сработает, т.к. объекты с типом Dog знают о методах класса


        // ПОЗДНЕЕ СВЯЗЫВАНИЕ
        Animal animal1 = new Dog();
        animal1.eat(); // если в потомке есть другая реализация, которая отличается от реализации родителя, то вызывается реализация потомка!


        // ПЕРЕДАЧА В МЕТОД РАЗНЫХ ТИПОВ, ЕСЛИ У НИХ ОДИН РОДИТЕЛЬ
        Animal animal3 = new Animal();
        Dog dog1 = new Dog();
        Cat cat = new Cat();

        test(animal3); // вызывается родительский метод eat
        test(dog1); // вызывается переопределённый метод eat
        test(cat); // метод вызывается из родителя (Animal), т.к. своего метода у него нет
    }

    // ПЕРЕДАЧА В МЕТОД РАЗНЫХ ТИПОВ, ЕСЛИ У НИХ ОДИН РОДИТЕЛЬ
    public static void test(Animal animal3) { //принимает в качестве аргумента переменную класса Animal
        animal3.eat();
    }
}
