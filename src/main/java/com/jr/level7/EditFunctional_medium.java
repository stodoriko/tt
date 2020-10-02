package com.jr.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EditFunctional_medium {
    public static void main(String[] args) throws IOException {

        // считываем значение
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // создаём строковый массив
        ArrayList<String> stringArrayList = new ArrayList<>();


        for (int j = 0; j < stringArrayList.size()+1; j++) {
            String name = reader.readLine();
            if (name.equals("")) {
                break;
            } else {
                stringArrayList.add(name);
            }

        }


        for (int i = 0; i < stringArrayList.size(); i++) {

            int length = stringArrayList.get(i).length();
            String name = stringArrayList.get(i);

            if (length % 2 == 0) {
                stringArrayList.add(i, name + " " + name);
                stringArrayList.remove(i+1);
            } else {
                stringArrayList.add(i, name + " " + name + " " + name);
                stringArrayList.remove(i+1);
            }
        }

        for (String s : stringArrayList) {
            System.out.println(s);
        }
    }
}