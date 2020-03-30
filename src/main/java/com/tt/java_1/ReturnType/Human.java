package com.tt.java_1.ReturnType;

public class Human {

    int age;
    String firstName;
    String lastName;
    String gender;

    final int MALE = 65;
    final int FEMALE = 60;

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public int yearsToRetirement() {
        if (gender.equals("male")) {
            int years = MALE - age;
            return years;
        } else {
            int years = FEMALE - age;
            return years;
        }
    }
}
