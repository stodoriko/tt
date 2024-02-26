package com.jr.JavaSyntax.level4;

import java.util.Scanner;

public class TenTen {

    public static String[] strings;
    // {"Hello", "Hello", "World", "Java", "Tasks", "World"}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        String s = null;

        for (int i = 0; i < strings.length; i++) {
            for (int k = i + 1; k < strings.length; k++)
                if (strings[i] == null) {
                    break;
                } else if (strings[i].equals(strings[k])) {
                    strings[i] = s;
                    strings[k] = s;
                    break;
                }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}