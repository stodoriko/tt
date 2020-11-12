package com.jr.JavaSyntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String1 {
    public static void main(String[] args) throws IOException {
        String[] stringArray = initializeArray();
        reverArray(stringArray);
    }

    public static String[] initializeArray() throws IOException {
        String[] array = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length - 2; i++) {
            array[i] = reader.readLine();
        }
        return array;
    }

    public static void reverArray(String[] stringArray) {
        int countString = stringArray.length;
        for (int i = countString; i > 0; i--) {
            System.out.println(stringArray[i - 1]);
        }
    }
}
