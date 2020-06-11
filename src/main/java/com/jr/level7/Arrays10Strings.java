package com.jr.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Arrays10Strings {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        String expString;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            expString = bf.readLine();
            arrayList.add(0, expString);
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
