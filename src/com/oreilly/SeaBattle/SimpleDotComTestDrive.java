package com.oreilly.SeaBattle;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int[] locations = {2,3,4};
        simpleDotCom.setLocationCells(locations);
        String result = simpleDotCom.checkYourSelf("4");


    }
}
