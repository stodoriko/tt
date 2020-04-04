package com.jr;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

//        Вводить с клавиатуры числа и вычислить среднее арифметическое.
//        Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
//                -1 не должно учитываться.

        double sum = 0;

        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();


        for (int i = 0; i < i+1; i++) {
            // считываем строку
            String inputValue = scanner.nextLine();
            // добавляем значение в массив
            list.add(inputValue);
            // каждый элемент массива переводит в число
            int intValue = Integer.parseInt(list.get(i).toString());

            if (intValue != -1) {
                sum = sum + intValue;
            } else {
                System.out.println(sum / i);
                break;
            }
        }
    }
}
