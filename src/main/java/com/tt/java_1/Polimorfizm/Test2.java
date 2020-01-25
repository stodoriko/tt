package com.tt.java_1.Polimorfizm;

public class Test2 {
    public static void main(String[] args) {

        Lokomotive lokomotive = new Lokomotive();
        lokomotive.homeMatchPlaysOnRZDStadium();

        Lokomotive lokomotive1 = new Players();
        lokomotive.homeMatchPlaysOnRZDStadium();
        lokomotive1.homeMatchPlaysOnRZDStadium();

        Players players = new Players();
        players.homeMatchPlaysOnRZDStadium();

        Lokomotive lokomotive2 = new Loskov();
        lokomotive2.homeMatchPlaysOnRZDStadium();
        System.out.println("----------------");

        Loskov loskov = new Loskov();
        loskov.homeMatchPlaysOnRZDStadium();
        loskov.executionOfPenalties();

        System.out.println("-----------");
        test(lokomotive);
        test(players);
        test(loskov);
    }

    public static void test(Lokomotive lokomotive) {
        System.out.println("Общий метод для всех");
    }
}
