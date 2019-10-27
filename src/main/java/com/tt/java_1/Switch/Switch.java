package com.tt.java_1.Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) throws NumberFormatException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст!");
        int age = scanner.nextInt();

        switch (age) {
            case 0 :
                System.out.println("0");
                break;
            case 1 :
                System.out.println("1");
                break;
            case 2 :
                System.out.println("2");
                break;
            default:
                System.out.println("default"); // если ни один из вариантов не подошёл
        }



        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введи имя!");

        String name = scanner1.nextLine();

        switch (name) {
            case "Влад":
                System.out.println("Кочетов");
                break;
            case "Сергей":
                System.out.println("Тодорико");
                break;
            default:
                System.out.println("Что-то я тебя не знаю!");
                break;
        }

        scanner.close();
        scanner1.close();

    }
}
