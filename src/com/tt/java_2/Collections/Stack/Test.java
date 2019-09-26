package com.tt.java_2.Collections.Stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // последним добавился - первым получаем
        stack.push(5); // толкаем элемент в stack
        stack.push(3);
        stack.push(1);

        System.out.println(stack.pop()); // достаём последний элемент из stack
        System.out.println(stack.pop());

        System.out.println(stack.peek()); // смотрим, но не достаём
        System.out.println(stack.pop());

        System.out.println("-----------------");

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(5); // толкаем элемент в stack
        stack2.push(3);
        stack2.push(1);

        // достаём элементы пока стэк не пустой
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
}
