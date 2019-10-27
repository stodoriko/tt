package com.tt.java_1.Modifiers;

import com.tt.java_1.Modifiers.Package1.Person;

// класс или public или default
public class Test extends Person{
    public static void main(String[] args) {
        //public - Область видимость в проекте
        //private - Область видимость в классе
        //default - если не указываем, он по-молчанию. Область видимость в пакете
        //protected - Область видимости в пакета, а также в подклассах, даже если они за пределами пакета

        //public пример
        // получили доступ к публичному полю из класса Person
        Person person = new Person();
        person.name = "Bob";


        //default пример
        // доступа к полю нет, т.к. класс Test находится за пределами пакета Package1
        //person.age;

    }

    //protected пример
    public Test() {
        gender = "famele"; // класс Test наследуется от Person. Получили доступ к полю gender за пределами пакета Package1
    }
}

// Один файл не может содержать 2 публичных класса, но может множество дефолтных
//public class Test{
//
//}
