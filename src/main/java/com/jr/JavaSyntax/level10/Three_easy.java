package com.jr.JavaSyntax.level10;

/*
Добавь одну операцию по преобразованию типа, чтобы получился ответ: b = 0.
        float f = (float)128.50;
        int i = (int)f;
        int b = (int)(i + f);

        Требования:
        •	Программа должна выводить текст на экран.
        •	Нельзя менять команду вывода на экран.
        •	Метод main() должен содержать переменную f типа float.
        •	Метод main() должен содержать переменную i типа int.
        •	Метод main() должен содержать переменную b типа int.
        •	Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
        •	Программа должна выводить число 0.
 */

public class Three_easy {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (byte) f; // (int) f на (byte) f
        int b = (int) (i + f);
        System.out.println(b);
    }
}