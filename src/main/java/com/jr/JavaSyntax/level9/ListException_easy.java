package com.jr.JavaSyntax.level9;

/*
    Требования:
    •	Программа должна выводить сообщение на экран.
    •	В программе должен быть блок try-catch.
    •	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
    •	Выведенное сообщение должно содержать тип возникшего исключения.
    •	Имеющийся код в методе main не удалять.
 */

import java.util.ArrayList;

public class ListException_easy {
    public static void main(String[] args) {

        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}
