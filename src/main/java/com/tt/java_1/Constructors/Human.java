package com.tt.java_1.Constructors;

import java.util.ArrayList;

class Human {

    private int age;
    private String firstName;
    private String lastName;
    private String gender;
    private String birthPlace;
    private String fullInfo;
    private ArrayList<String> humansList = new ArrayList<>();

    public Human(int age, String firstName, String lastName, String gender, String birthPlace) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthPlace = birthPlace;

        String fullInfo = firstName + " " + lastName + "; " + age + "; " + gender + "; " + birthPlace;
        humansList.add(fullInfo);
        System.out.println(humansList.toString());
    }

}
