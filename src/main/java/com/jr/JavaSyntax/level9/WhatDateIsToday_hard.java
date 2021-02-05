package com.jr.JavaSyntax.level9;

//        Ввести с клавиатуры дату в формате "2013-08-18"
//        Вывести на экран введенную дату в виде "AUG 18, 2013".
//        Воспользоваться объектом Date и SimpleDateFormat.
//
//        Требования:
//        •	Программа должна считывать данные с клавиатуры.
//        •	В программе должна быть объявлена переменная типа SimpleDateFormat.
//        •	В программе должна быть объявлена переменная типа Date.
//        •	Программа должна выводить данные на экран.
//        •	Вывод должен соответствовать заданию.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WhatDateIsToday_hard {
    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Считываем дату с консоли:
        //*Создаем новую переменную класса дата и называем ее date.
        //Присваиваем ей значение формата, указанного в скобках, и полученного из разбора консольной строки.
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(reader.readLine());
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // создаём новый тип формата -- AUG 18, 2013
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        // Печатаем нашу дату в новом формате, попутно изменив регистр букв на верхний:
        System.out.println(dateFormat.format(date).toUpperCase());
    }
}
