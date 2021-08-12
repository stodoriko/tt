package com.jr.JavaSyntax.level10;

public class MinStatic {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        MinStatic minStatic = new MinStatic();
        minStatic.A = 5;
        minStatic.B = 5 * B;
        minStatic.C = 5 * C * D;

        MinStatic.D = 5 * D * C;
        MinStatic.D = 5;
    }

    public int getA() {
        return A;
    }

}
