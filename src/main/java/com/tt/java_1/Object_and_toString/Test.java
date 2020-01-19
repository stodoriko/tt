package com.tt.java_1.Object_and_toString;

public class Test {
    public static void main(String[] args) {
        Human human = new Human("Sergei", 31);
        System.out.println(human); // На экран выводится Human@18769467

        // Переопределяем метод toString()
        System.out.println(human);
    }
}
