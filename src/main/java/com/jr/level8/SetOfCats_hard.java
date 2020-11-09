package com.jr.level8;
/*
Требования:
•	Программа должна выводить текст на экран.
•	Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
•	Метод createCats() класса Solution должен возвращать множество (Set), содержащее 3 кота.
•	Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
•	Метод main() должен один раз вызывать метод createCats().
•	Метод main() должен вызывать метод printCats().
•	Метод main() должен удалять одного кота из множества котов.
 */

import com.jr.Cat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfCats_hard {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();


        Iterator<Cat> iterator = cats.iterator();

        cats.remove(iterator.next());


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {

    }
}
