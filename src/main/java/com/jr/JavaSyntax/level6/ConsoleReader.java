package com.jr.JavaSyntax.level6;

/*      Класс ConsoleReader
        Сегодня студенты секретного центра JavaRush получили задание по чтению.
        Им (и вам) нужно создать класс ConsoleReader с 4 статическими методами:
        один из них считывает с клавиатуры строку, другой — целое число, третий — дробное.
        Четвертый отличается: он считывает с клавиатуры строку true или false и возвращает соответствующую логическую переменную.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReader {

    public static String readString() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String stringValue = bf.readLine();
        return stringValue;
    }

    public static int readInt() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int intValue = Integer.parseInt(bf.readLine());
        return intValue;
    }

    public static double readDouble() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double doubleValue = scanner.nextDouble();
        return doubleValue;
    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean booleanValue = scanner.nextBoolean();
        return booleanValue;
    }

    public static void main(String[] args) throws Exception {

    }

}
