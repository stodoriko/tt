package com.jr.JavaSyntax.level9;

import com.jr.JavaSyntax.level6.Solution;

import java.io.IOException;
import java.rmi.RemoteException;

//    Требования:
//        •	Метод handleExceptions должен вызывать метод method1.
//        •	Метод handleExceptions должен вызывать метод method2.
//        •	Метод handleExceptions должен вызывать метод method3.
//        •	Метод handleExceptions должен использовать только один блок try..catch.
//        •	Метод handleExceptions должен отлавливать и выводить на экран все возникающие checked исключения.
//        •	Программа должна выводить на экран текст.

public class CheckedException_easy {
    public static void main(String[] args) {
        handleExceptions(new CheckedException_easy());
    }

    public static void handleExceptions(CheckedException_easy obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (IOException | NoSuchFieldException e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
