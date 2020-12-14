package com.jr.JavaSyntax.level7;

//Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Программа должна выводить обратный отсчет от 30 до 0. Каждую цифру на новой строке.
//        •	Программа должна выводить "Бум!" после отсчета.
//        •	Программа должна использовать метод "Thread.sleep(100);" 31 раз.

public class Boom_easy {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }

        System.out.println("Бум!");
    }
}
