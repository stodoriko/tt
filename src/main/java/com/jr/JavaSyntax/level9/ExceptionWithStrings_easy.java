package com.jr.JavaSyntax.level9;

/*
    Требования:
    •	Программа должна выводить сообщение на экран.
    •	В программе должен быть блок try-catch.
    •	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
    •	Выведенное сообщение должно содержать тип возникшего исключения.
    •	Имеющийся код в методе main не удалять.
 */

public class ExceptionWithStrings_easy {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
