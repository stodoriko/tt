package com.jr.JavaSyntax.level9;

//    Требования:
//        •	Программа должна считывать имена файлов.
//        •	Метод main должен обрабатывать исключения кидаемые методом getInputStream. Если возникло исключение, нужно вывести сообщение «Файл не существует.».
//        •	Программа должна копировать содержимое первого файла во второй.
//        •	В методе main должен вызываться метод getInputStream.
//        •	Метод getInputStream изменять нельзя.
//        •	В методе main должен вызываться метод getOutputStream.
//        •	Метод getOutputStream изменять нельзя.

import java.io.*;

public class CodeWithFunc_middle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();

        InputStream fileInputStream = null;
        try {
            fileInputStream = getInputStream(sourceFileName);
        } catch (FileNotFoundException f) {
            System.out.println("Файл не существует.");
            // прочитываем файл второй раз для того чтобы выполнилось условие в блоке while
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }

        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
