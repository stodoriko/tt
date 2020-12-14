package com.jr.JavaSyntax.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrossTheRoad2_hard {
    public static void main(String[] args) throws IOException {

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

            // Единственное не учитывается, что час это 60 минут, но для этого достаточно будет небольшое условие,
            // которое проверит, что введенное число меньше 60 минут.

    }
}
