package com.tt.java_1.ReturnType;

public class Test {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        human1.setAge(31);
        human1.setFirstName("Сергей");
        human1.setLastName("Тодорико");
        human1.setGender("male");
        String fullName1 = human1.getFullName();
        int yearsHuman1 = human1.yearsToRetirement();

        human2.setAge(30);
        human2.setFirstName("Ольга");
        human2.setLastName("Манаенкова");
        human2.setGender("female");
        String fullName2 = human2.getFullName();
        int yearsHuman2 = human2.yearsToRetirement();

        System.out.println(fullName1 + ":" + yearsHuman1);
        System.out.println(fullName2 + ":" + yearsHuman2);


    }


}
