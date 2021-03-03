package com.jr.JavaSyntax.level9;

/*
    Требования:
    •	Программа должна выводить сообщение на экран.
    •	В программе должен быть блок try-catch.
    •	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
    •	Выведенное сообщение должно содержать тип возникшего исключения.
    •	Имеющийся код в методе main не удалять.
 */

import java.util.HashMap;

public class MapException_easy {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
