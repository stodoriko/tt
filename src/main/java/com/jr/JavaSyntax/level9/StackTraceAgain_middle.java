package com.jr.JavaSyntax.level9;

/*
    Требования:
    •	В классе должно быть 5 методов (метод main не учитывать).
    •	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
    •	Каждый метод должен возвращать имя метода, вызвавшего его.
    •	Для получения имени вызвавшего метода, используй метод getMethodName.
 */

public class StackTraceAgain_middle {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String methodName = element.getMethodName();
        return methodName;
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String methodName = element.getMethodName();
        return methodName;
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String methodName = element.getMethodName();
        return methodName;
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String methodName = element.getMethodName();
        return methodName;
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String methodName = element.getMethodName();
        return methodName;
    }
}
