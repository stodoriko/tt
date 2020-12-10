package com.jr.JavaSyntax.level9;

//Требования:
//        •	Метод main должен вызывать метод method1.
//        •	Метод main должен перехватывать исключение NullPointerException.
//        •	Метод main должен перехватывать исключение FileNotFoundException.
//        •	Метод main не должен перехватывать исключение ArithmeticException.
//        •	Метод main не должен перехватывать исключение URISyntaxException.
//        •	Метод method1 не изменять.

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class JustException_easy {
    public static void main(String[] args) throws ArithmeticException, URISyntaxException {
        try {
            method1();
        } catch (NullPointerException n) {
            System.out.println(n);
        } catch (FileNotFoundException f) {
            System.out.println(f);
        }
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
