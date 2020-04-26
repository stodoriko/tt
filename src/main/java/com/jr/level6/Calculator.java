package com.jr.level6;

public class Calculator {

    public static int plus(int a, int b) {
        int value = a + b;
        return value;
    }

    public static int minus(int a, int b) {
        int value = a - b;
        return value;
    }

    public static int multiply(int a, int b) {
        int value = a * b;
        return value;
    }

    public static double division(int a, int b) {
        double value = (double)a / b;
        System.out.println(value);
        return value;
    }

    public static double percent(int a, int b) {
        double value = (double)(a / 100.0) * b;
        System.out.println(value);
        return value;
    }

    public static void main(String[] args) {
        Calculator.percent(115,6);
    }
}
