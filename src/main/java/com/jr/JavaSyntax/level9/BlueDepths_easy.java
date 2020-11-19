package com.jr.JavaSyntax.level9;

/*
    Требования:
    •	Метод getStackTraceDepth должен возвращать глубину своего стек-трейса.
    •	Метод getStackTraceDepth должен выводить на экран глубину своего стек-трейса.
    •	Воспользуйся методом Thread.currentThread().getStackTrace().
    •	Метод main должен вызывать метод getStackTraceDepth.
 */

public class BlueDepths_easy {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        int value = Thread.currentThread().getStackTrace().length;
        System.out.println(value);
        return value;
    }
}
