package com.tt.java_1.While;

public class Test7 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i++;
            int  j = i * 27;
            if (j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.println(i + " ");
        }
    }
}
