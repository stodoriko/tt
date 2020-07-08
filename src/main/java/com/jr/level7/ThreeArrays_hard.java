package com.jr.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
 * Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
 * Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 * Порядок объявления списков очень важен.
 * 2. Метод printList должен выводить на экран все элементы списка с новой строки.
 * 3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
 *
 * Требования:
 * •	Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
 * •	Считать 20 чисел с клавиатуры и добавить их в главный список.
 * •	Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
 * •	Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
 * •	Добавить в третий дополнительный список все остальные числа из главного.
 * •	Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
 * •	Программа должна вывести три дополнительных списка, используя метод printList.
 */


public class ThreeArrays_hard {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> mainIntList = new java.util.ArrayList<Integer>();
        ArrayList<Integer> intListOne = new java.util.ArrayList<Integer>();
        ArrayList<Integer> intListTwo = new java.util.ArrayList<Integer>();
        ArrayList<Integer> intListThree = new java.util.ArrayList<Integer>();
        int a;


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            int inputValue = Integer.parseInt(bf.readLine());
            mainIntList.add(inputValue);
        }

        for (Integer integer : mainIntList) {
            if (integer % 3 == 0 && integer % 2 == 0) {
                a = integer;
                intListOne.add(a);
                intListTwo.add(a);
                continue;
            } else if (integer % 3 == 0) {
                a = integer;
                intListOne.add(a);
            } else if (integer % 2 == 0) {
                a = integer;
                intListTwo.add(a);
            } else {
                a = integer;
                intListThree.add(a);
            }
        }

        printList(mainIntList);
        printList(intListOne);
        printList(intListTwo);
        printList(intListThree);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
