package com.jr.JavaSyntax.level10;

public class BigSalary_easy {
    public static void main(String[] args) {
            String text = "Я не хочу изучать Java, я хочу большую зарплату";
            for (int i = 0; i < 40; i++) {
                System.out.println(text);
                text = text.substring(1);
            }



    }
}
