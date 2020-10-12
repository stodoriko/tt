package com.jr.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrossTheRoad_hard {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String time = buf.readLine();
        double t = Double.parseDouble(time);
        if(t % 5 >= 0 && t % 5 < 3)
            System.out.println("зелёный");
        else if(t % 5 >= 3 && t % 5 < 4)
            System.out.println("жёлтый");
        else if(t % 5 >= 4 && t % 5 < 5)
            System.out.println("красный");
    }
}
