package com.jr.level6;

public class WashWindow {
    public static void main(String[] args) {

        String[] list = {"Мама","Мыла","Раму"};

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if (i != j) {
                    System.out.println(list[i] + list[j] + list[3-(i+j)]);
                }
            }
        }
    }
}
