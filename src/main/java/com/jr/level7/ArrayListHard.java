package com.jr.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListHard {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        strings = new ArrayList<>();
        ArrayList<String> arrayListMax = new ArrayList<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) {
            String expString = bf.readLine();
            strings.add(expString);
        }

        String maxExpString = strings.get(0);

        for (String value : strings) {
            if (maxExpString.length() < value.length()) {
                maxExpString = value;
            }
        }

        for (String s : strings) {
            if (maxExpString.length() == s.length()) {
                arrayListMax.add(s);
                System.out.println(s);
            }
        }
    }
}
