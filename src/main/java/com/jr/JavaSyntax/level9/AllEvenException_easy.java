package com.jr.JavaSyntax.level9;

//    Требования:
//        •	В классе Solution должно быть 4 вложенных класса: MyException, MyException2, MyException3 и MyException4.
//        •	Все вложенные классы должны быть унаследованы от классов исключений.
//        •	Два класса из четырех должны быть checked исключениями.
//        •	Два класса из четырех должны быть unchecked исключениями.

import java.io.IOException;

public class AllEvenException_easy {
    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends ReflectiveOperationException {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends ArithmeticException {
    }
}
