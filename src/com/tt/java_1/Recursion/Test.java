package com.tt.java_1.Recursion;

public class Test {
    public static void main(String[] args) {
//        someMethod();
//        counter(3);
        System.out.println(factorial(7));
    }

    private static void someMethod() {
        System.out.println("Hello");
        someMethod(); //рекурсивный вызов метода(не выходя из метода выполняем повторный вызов)
    }

    // происходят вызовы counter(3) -> counter(2) -> counter(1) -> counter(0)
    // counter(3) ждёт выполнения counter(2), а затем counter(2) ждёт выполнения counter(1) и т.д.
    // после выполнения counter(0), происходит выход из метода, и прекращение работы ожидающих методов 0,1,2,3
    private static void counter(int n) {
        if (n < 0) { // условие выхода
            return;
        }

        System.out.println(n);
        counter(n - 1);
    }


    // 15 * factorial(14) -> 15 * 14
    // ......
    // 4 * factorial(3) -> 4 * 3
    // 3 * factorial(2) -> 3 * 2
    // 2 * factorial(1) -> 2 * 1
    // 1 * factorial(0) -> 1 * 1

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
