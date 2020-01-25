package com.tt.java_1.Polimorfizm;

public class Loskov extends Players {

    public void executionOfPenalties() {
        System.out.println("Штатный пенальтист");
    }

    @Override
    public void homeMatchPlaysOnRZDStadium() {
        System.out.println("Завершил карьеру игрока");
    }
}
