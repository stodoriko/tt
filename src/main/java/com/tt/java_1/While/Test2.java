package com.tt.java_1.While;

import java.util.Scanner;

public class Test2 {

//    Ввести с клавиатуры строку и число N больше 0.
//    Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int value = scanner.nextInt();

        while (value > 0) {
            System.out.println(string);
            value--;
        }
    }
}
