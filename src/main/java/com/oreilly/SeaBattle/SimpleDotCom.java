package com.oreilly.SeaBattle;

public class SimpleDotCom {

    private int[] locationCells;
    private int numOfHits;
    private String userInput;
    private String result;


    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourSelf(String userInput) {

//        while (userGuess != null) {
        if (userInput == null) {
            System.out.println("Вы ничего не указали.");
            result = "Вы ничего не указали.";
        } else {
//        }
            int intUserInput = Integer.parseInt(userInput);

            result = "Мимо";

            for (int cell : locationCells) {
                if (cell == intUserInput) {
                    result = "Попал!";
                    numOfHits++;
                    break;
                }
            }

            if (numOfHits == locationCells.length) {
                result = "Потопил!";
            }
            System.out.println(result);
        }
        return result;
    }
}


