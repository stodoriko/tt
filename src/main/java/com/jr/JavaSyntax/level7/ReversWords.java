package com.jr.JavaSyntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

Требования:
•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
•	Считай 5 строк с клавиатуры и добавь их в список.
•	Удали третий элемент списка.
•	Выведи элементы на экран, каждый с новой строки.
•	Порядок вывода должен быть обратный.
 */

public class ReversWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        java.util.ArrayList<String> arrayList = new ArrayList<>();
        String inputExpression;

        for (int i = 0; i < 5; i++) {
            inputExpression = bf.readLine();
            arrayList.add(inputExpression);
        }

        arrayList.remove(2);

        for (int j = arrayList.size(); j > 0; j--) {
            System.out.println(arrayList.get(j - 1));
        }
    }
}
