package com.tt.Exception;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    /*
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        while (true) {
            String string = scanner.nextLine();
            int x = Integer.parseInt(string);

            if (x != 0) { // если вводимое чило не равно нулю, то выбрасывается exception
                throw new IOException("Не равно нулю");
            }
        }
    }
     */

    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();
            int x = Integer.parseInt(string);

            if (x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Пользователь ввёл что-то кроме нуля");
                    ;
                }
            }
        }
    }
     */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                try {
                    throw new TodorikoException("Збс вечерок, очень нравится мне!");
                } catch (TodorikoException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
