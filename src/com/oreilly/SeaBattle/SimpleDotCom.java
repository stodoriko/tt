package com.oreilly.SeaBattle;

public class SimpleDotCom {

    private int[] locationCells;
    private int numOfHits;
    String userGuess;


    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourSelf(String userGuess) {
        int intUserGuess = Integer.parseInt(userGuess);
        String result = "Мимо";

        for (int cell : locationCells) {
            if (cell == intUserGuess) {
                result = "Попал!";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "Потопил!";
        }
        System.out.println(result);
        return result;
    }
}


