package com.jr.level7;
/*
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод fix должен удалять из списка строк все слова, содержащие букву "р". Исключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
•	Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
•	Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
•	Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
 */

import java.util.ArrayList;

public class ROrL_hard {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if ((strings.get(i).contains("р"))&&(strings.get(i).contains("л"))) {

            } else if (strings.get(i).contains("р")) {
                strings.remove(strings.get(i));
                i--;
            }
        }

        for (int k = 0; k < 2; k++) {
            if ((strings.get(k).contains("р"))&&(strings.get(k).contains("л"))) {
                continue;
            } else if (strings.get(k).contains("л")) {
                strings.add(strings.get(k));
            }
        }

        return strings;
    }
}

