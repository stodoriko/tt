package com.tt.java_1.Static;

public class Zoo {
    public static void main(String[] args) {
//        Animal animal = new Animal("tiger", 5, 147.4, true);
        Animal animal1 = new Animal("", 4, 201, false );
        String fullInformation = animal1.getInformationAboutAnimal();
        System.out.println(fullInformation  + Animal.MAMMALS);
    }
}
