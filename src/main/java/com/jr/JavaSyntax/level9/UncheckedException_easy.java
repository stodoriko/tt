package com.jr.JavaSyntax.level9;

//    Требования:
//        •	Метод handleExceptions должен вызывать метод method1.
//        •	Метод handleExceptions должен вызывать метод method2.
//        •	Метод handleExceptions должен вызывать метод method3.
//        •	Метод handleExceptions должен использовать только один блок try..catch.
//        •	Метод handleExceptions должен отлавливать все unchecked исключения и выводить стек-трейс возникшего исключения, используя метод printStack.
//        •	Метод handleExceptions не должен отлавливать checked исключения
//        •	Программа должна выводить на экран текст.

public class UncheckedException_easy {
    public static void main(String[] args) {
        handleExceptions(new UncheckedException_easy());
    }

    public static void handleExceptions(UncheckedException_easy obj) throws RuntimeException {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch(RuntimeException r) {
            printStack(r);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
