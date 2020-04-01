package com.tt.java_1.For;

public class Test3 {
    public static void main(String[] args) {

//        Используя цикл for вывести на экран:
//        - горизонтальную линию из 10 восьмёрок
//                - вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).

        int eight = 8;

        for(int i = 0; i < 1; i++) {
            for(int a = 0; a < 10; a++) {
                System.out.print(eight);
            }
            System.out.println();
        }

        for(int k = 0; k < 10; k++) {
            for(int b = 0; b < 1; b++) {
                System.out.print(eight);
            }
            System.out.println();
        }

    }
}
