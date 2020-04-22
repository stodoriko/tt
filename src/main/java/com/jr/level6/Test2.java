package com.jr.level6;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String inputValue = scanner.nextLine();
        for (int i = 0; i < inputValue.length(); i++) {
            char value = inputValue.charAt(i);
            String characterToString = Character.toString(value);
            int intValue = Integer.parseInt(characterToString);
            if (intValue % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
        }

        System.out.print("Even: " + even);
        System.out.print(" ");
        System.out.print("Odd: " + odd);

    }
}
