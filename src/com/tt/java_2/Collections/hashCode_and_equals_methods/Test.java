package com.tt.java_2.Collections.hashCode_and_equals_methods;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put(1, "один");
        map.put(1, "один - 1");

        set.add(1);
        set.add(1);

        System.out.println(map); // более новое значение
        System.out.println(set); // одна 1, т.к. дубль



        Map<Person, String> map2 = new HashMap<>();
        Set<Person> set2 = new HashSet<>();

        Person person1 = new Person(1, "Bob");
        // Person person2 = new Person(2, "Tod");
        Person person2 = new Person(1, "Bob");

        map2.put(person1, "777");
        map2.put(person2, "777");

        set2.add(person1);
        set2.add(person2);

        // вывод не гарантирует того порядка, в котором объекты были созданы
        System.out.println(map2);
        System.out.println(set2);

        // вывод:
//        {Person(id=2, name='Tod')=777, Person(id=1, name='Bob')=777}
//        [Person(id=2, name='Tod'), Person(id=1, name='Bob')]

        // комментирую строку 28 и в 29 строке меняю на значения из объекта person1
        // вывод:
//        {Person(id=1, name='Bob')=777, Person(id=1, name='Bob')=777} -- map2 допускает, что у нас 2 разных объекта класса Person
//        [Person(id=1, name='Bob'), Person(id=1, name='Bob')] -- set2 допускает, что у нас дважды повторяется один и тот же объект
        // получается, что объекты разные, т.к. реализация метода equals() из класса Object только сравнивает ссылки на объект, и если ссылки идентичны, то это один объект, а у нас ссылки на объект разные

        // переопределяем методы equals() и hashCode()


    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ')';
    }

    // Теперь они тогда равны, когда они равны по смыслу
    // p.s. (только так могу написать, т.к. нихера не понимаю пока, как переопределяются эти методы)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
