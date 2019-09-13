package com.tt.java_1.Exception;

import java.io.IOException;
import java.text.ParseException;

public class Exception4 {
    public static void main(String[] args) {
        try {
            run();
            // для каждого исключения свой catch блок
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            eat();
        } catch (IOException | ParseException e) { // обрабатываем оба исключения одинаково
            e.printStackTrace();
        }
        
    }

    // можно выбрасывать несколько типов исключений
    public static void run() throws IOException, ParseException {

    }

    public static void eat() throws IOException, ParseException {

    }

}
