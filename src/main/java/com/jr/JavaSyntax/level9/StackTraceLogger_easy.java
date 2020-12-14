package com.jr.JavaSyntax.level9;

/*
    Требования:
    •	Метод log должен выводить сообщение на экран.
    •	Выведенное сообщение должно содержать имя класса, метод которого вызвал метод log.
    •	Выведенное сообщение должно содержать имя метода, который вызвал метод log.
    •	Выведенное сообщение должно содержать переданное сообщение.
    •	Вывод должен соответствовать примеру из задания.
 */

public class StackTraceLogger_easy {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String className = element.getClassName();
        String methodName = element.getMethodName();
        String message = className + ": " + methodName + ": " + text;
        System.out.println(message);
    }
}
