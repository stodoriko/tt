package com.tt.java_1.Scanner;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String age = scanner.nextLine();
        String name = scanner.nextLine();

        int ageInt = Integer.parseInt(age);

        if(ageInt < 18) {
            System.out.println("Подрасти еще");
        } else {

        }

        scanner.close();

    }
}
