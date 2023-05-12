package com.alghoritms;

import static java.lang.Math.random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] digits = new int[100];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int) (Math.random() * digits.length - 1);
        }

        for (int k = 0; k < digits.length; k++) {
            int min = digits[k];
            int srch = digits[k+1];

            if (srch < min) {
                min = srch;
                digits[0] = min;
            }

        }
    }
}
