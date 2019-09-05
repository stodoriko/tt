package com.tt.WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("textFile");
        PrintWriter printWriter = new PrintWriter(file); // Преднозначен для записи только текстовых значений

        printWriter.println("Тодорико Сергей Михайлович");
        printWriter.println("31 год");
        printWriter.println("18.04.1988");

        printWriter.close();
    }
}
