package com.tt.java_1.Scanner;

import java.util.Scanner;

public class Test8 {

//    Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
//            "четное однозначное число" - если число четное и имеет одну цифру,
//            "нечетное однозначное число" - если число нечетное и имеет одну цифру,
//            "четное двузначное число" - если число четное и имеет две цифры,
//            "нечетное двузначное число" - если число нечетное и имеет две цифры,
//            "четное трехзначное число" - если число четное и имеет три цифры,
//            "нечетное трехзначное число" - если число нечетное и имеет три цифры.
//    Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
//
//    Пример для числа 100:
//    четное трехзначное число
//
//    Пример для числа 51:
//    нечетное двузначное число

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int residue = inputValue % 2;
        int bit = Integer.toString(inputValue).length();


        if (inputValue > 0 && inputValue < 1000) {
            if (residue == 0 && bit == 1) {
                System.out.println("четное однозначное число");
            } else if (residue == 1 && bit == 1) {
                System.out.println("нечетное однозначное число");
            } else if (residue == 0 && bit == 2) {
                System.out.println("четное двузначное число");
            } else if (residue == 1 && bit == 2) {
                System.out.println("нечетное двузначное число");
            } else if (residue == 0 && bit == 3) {
                System.out.println("четное трехзначное число");
            } else if (residue == 1 && bit == 3) {
                System.out.println("нечетное трехзначное число");
            }
        } else {
                System.out.println("");
        }
    }
}
