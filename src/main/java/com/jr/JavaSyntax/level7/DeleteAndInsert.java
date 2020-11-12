package com.jr.JavaSyntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DeleteAndInsert {
    public static void main(String[] args) throws IOException {

        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String exp;
        String lastString;

        for (int i = 0; i < 5; i++) {
            exp = bf.readLine();
            arrayList.add(exp);
            if (i == 4) {
                lastString = arrayList.get(4);
                for (int j = 0; j < 13; j++) {
                    arrayList.add(0, arrayList.remove(arrayList.size()-1));
                }
            }
        }

        for (int k = 0; k < 5; k++) {
            System.out.println(arrayList.get(k));
        }

    }
}
