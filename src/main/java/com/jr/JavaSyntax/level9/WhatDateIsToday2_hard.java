package com.jr.JavaSyntax.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WhatDateIsToday2_hard {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(reader.readLine());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);

        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }
}
