package com.tt.java_2.LinkedList;

import java.util.Arrays;

public class MyLinkedList {

    // для того, чтобы добавить элемент нам нужна голова списка
    // при создании объекта head примет null
    private Node head;
    // размер нашего linked list
    private int size;

    public void add(int value) {
        // если это первое добавление в список
        if (head == null) {
            this.head = new Node(value);
        } else { // если добавление не первое
            // после выполнения цикла while, temp(временный узел) указывает на последний узел в цепочке
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            // после первой итерации head[1], a temp[2]
            // [1] -> [2] -> [3]
            temp.setNext(new Node(value));
        }
        // после первого и последующего добавления переменная инкременируется
        size++;
    }

    // для просмотра содержимого списка создаём метод
    public String toString() {
        // временый массив целых чисел, с размером нашего списка
        int[] result = new int[size];
        int index = 0;
        Node temp = head;

        while (temp !=null) {
            result[index] = temp.getValue();
            temp = temp.getNext();
            index++;
        }
        return Arrays.toString(result);
    }

    // Создаём вложенный класс
    private static class Node {
        // значение хранящееся в текущем узле
        private int value;
        // ссылка на следующий узел
        private Node next;

        // создаём конструктор
        public Node(int value) {
            this.value = value;
        }


        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

    }
}
