package com.tt.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    /*
    public static void main(String[] args) throws FileNotFoundException { // выбросит исключение
        File file = new File("Bob");
        cпециально указываем несуществующий путь, чтобы получить ошибку
        Scanner scanner = new Scanner(file);
    }
     */

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Bob");
        // код, который может вызвать исключение находится в блоке try
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("После Scanner"); // строка не выполнится
        // обработка исключений в боке catch
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // или свой вариант
            //System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch");

        readFile(); // здесь будет ошибка, обрабатываем с помощью throws
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("Bob");
        Scanner scanner = new Scanner(file);
    }


}
