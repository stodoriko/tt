package com.tt.java_1.For;

public class Test2 {
    //    Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    public static void main(String[] args) {
        int eight = 8;

        for (int i = 0; i < 10; i++) {
            // с каждой новой итерациией цикла верхнего уровня, увеличивается количество итераций цикла на одну
            for (int a = 0; a < i+1; a++) {
                System.out.print(eight);
            }
            System.out.println();
        }

    }

}
