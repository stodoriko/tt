package com.jr.JavaSyntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReversInt {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> intList = new ArrayList<>();
        int inputValue;

        for (int i = 0; i < 10; i++) {
            inputValue = Integer.parseInt(bf.readLine());
            intList.add(inputValue);
        }

        for (int k = 10; k > 0; k--) {
            System.out.println(intList.get(k-1));
        }
    }
}
