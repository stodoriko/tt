package com.tt.java_1.While;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

//        Вводить с клавиатуры числа.
//        Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//                -1 должно учитываться в сумме.

        Scanner scanner = new Scanner(System.in);
        int totalValue = 0;

        while (true) {
            int value = scanner.nextInt();
            if (value >=0) {
                totalValue = totalValue + value;
            } else if (value == -1) {
                totalValue = totalValue + value;
                System.out.println(totalValue);
                break;
            } else {
                totalValue = totalValue + value;
            }
        }
    }
}
