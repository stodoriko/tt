package com.tt.java_1.StringBuilder;

public class Test {
    public static void main(String[] args) {
        // Все методы класса String возвращают новую строку после вызова метода
        String x = "hello";
        x.toUpperCase();
        System.out.println(x);

        // Результат выполнения метода присваеивается переменной y
        String y = "hello";
        y = y.toUpperCase();
        System.out.println(y);


        String string1 = "Hello ";
        String string2 = "my ";
        String string3 = "friend";
        // Это неэффективная операция
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);

        // Объекты класса StringBuilder млгут изменяться в ходе выполнения программы
        StringBuilder sb = new StringBuilder("Hello"); // В конструктор поставляем слово hello
        StringBuilder sb1 = new StringBuilder("Lokomotive");
        sb.append(" my"); // Указываем строку, которую хотим конкотенировать с объектом класса StringBuilder
        sb.append(" friend"); // и здесь
        System.out.println(sb.toString());
        // Какие плюсы от такой реализации?
        // Не создаются дополнительные объекты, соответсвенно повышается скорость выполнения.
        sb1.append(" Moscow").append(" Champion!");
        System.out.println(sb1);
    }
}
