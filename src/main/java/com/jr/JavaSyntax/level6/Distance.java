package com.jr.JavaSyntax.level6;

/*
Расстояние между двумя точками
*/

public class Distance {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double x = (x2 - x1)*(x2 - x1);
        double y = (y2 - y1)*(y2 - y1);
        double xy = x + y;
        return Math.sqrt(xy);
    }

    public static void main(String[] args) {

    }
}

