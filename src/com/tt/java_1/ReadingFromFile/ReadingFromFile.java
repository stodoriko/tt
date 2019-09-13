package com.tt.java_1.ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String s = File.separator; // Нужно для указания пути к файлу, чтобы независеть от операционной системы.
        String path = s + "Users" + s + "sergeytodoriko" + s + "IdeaProjects" + s + "tt" + s + "textFile";

        File file = new File(path);
        File file1 = new File("textFile2"); // если в файл корне проекта, то необязательно указывать полный путь

        Scanner scanner = new Scanner(file); // Scanner необходим для считывания потока
        while (scanner.hasNextLine()) { // если есть ещё строки, то переходим и считываем
            System.out.println(scanner.nextLine());
        }

        Scanner scanner1 = new Scanner(file1);
        String line = scanner1.nextLine();
        String[] numbersString = line.split("0"); // Разделяем данные по нулю
        int[] numbersInt = new int[3];
        int counter = 0;

        for (String number:numbersString) {
            numbersInt[counter++] = Integer.parseInt(number); // Переводим стринг в инт, записываем в массив и инкрементируем счётчик
        }

        System.out.println(Arrays.toString(numbersInt));

        scanner.close(); // обязательно закрываем поток данных
        scanner1.close();
    }
}
