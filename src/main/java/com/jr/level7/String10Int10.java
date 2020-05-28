package com.jr.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String10Int10 {
    public static void main(String[] args) throws IOException {
        String[] stringList = initializeStringList();
        int[] intList = initializeIntList();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < stringList.length; i++) {
            stringList[i] = bf.readLine();
        }

        for (int i = 0; i < intList.length; i++) {
            intList[i] = stringList[i].length();
            System.out.println(intList[i]);
        }
    }

    public static String[] initializeStringList() throws IOException {
        String[] stringList = new String[10];
        return stringList;
    }

    public static int[] initializeIntList() throws IOException {
        int[] intList = new int[10];
        return intList;
    }
}
