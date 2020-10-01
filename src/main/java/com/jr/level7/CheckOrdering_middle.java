package com.jr.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CheckOrdering_middle {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < i+1; i++) {
            if (i == 10) {
                break;
            } else {
                String inputValue = bf.readLine();
                arrayList.add(inputValue);
            }
        }
    }
}
