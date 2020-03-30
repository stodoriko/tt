package com.tt.java_1.Scanner;

import java.util.Scanner;

public class Test7 {

//    Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
//            "отрицательное четное число" - если число отрицательное и четное,
//            "отрицательное нечетное число" - если число отрицательное и нечетное,
//            "ноль" - если число равно 0,
//            "положительное четное число" - если число положительное и четное,
//            "положительное нечетное число" - если число положительное и нечетное.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();

        if (b % 2 == 0 && b < 0) {
            System.out.println("отрицательное четное число");
        } else if (b % 2 != 0 && b < 0) {
            System.out.println("отрицательное нечетное число");
        } else if (b % 2 == 0 && b > 0) {
            System.out.println("положительное четное число");
        } else if (b % 2 != 0 && b > 0) {
            System.out.println("положительное нечетное число");
        } else {
            System.out.println("ноль");
        }

    }

}
