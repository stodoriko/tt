package com.jr.JavaSyntax;

public class Tank {
    int leval;

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.leval = 9;
        t2.leval = 47;
        System.out.println("1:" + t1.leval + ", 2:" + t2.leval);
        t1 = t2;
        System.out.println("1:" + t1.leval + ", 2:" + t2.leval);
        t1.leval = 27;
        System.out.println("1:" + t1.leval + ", 2:" + t2.leval);
    }
}
