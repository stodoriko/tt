package com.jr.JavaSyntax.level6;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(Math.min(a, Math.min(b, c)));



    }
}
