package com.tt.java_1.Enum;

public enum Month {
    // каждая из этих строк - это объект энама(класса) month
    // Object -> Enum -> Season

    JENUARY("Январь", -20),
    FEBRUARY("Февраль", -25),
    MARCH("Март", -5),
    APRILL("Апрель", 5),
    MAY("Май",15),
    JUNE("Июнь",25),
    JULY("Июль",30),
    AUGUST("Август",25),
    SEPTEMBER("Сентябрь",15),
    OCTOMBER("Октябрь",10),
    NOVEMBER("Ноябрь",0),
    DECEMBER("Декабрь", -10);

    private String translation;
    private int temperature;

    // Перевод на русский язык
    Month(String translation, int temperature) {
        this.translation = translation;
        this.temperature = temperature;
    }

    public String getTranslation() {
        return translation;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getInfo() {
        return "Средняя температура воздуха в " + translation + " равна " + temperature + "'C";
    }

    // Переопределяю метод toString()
    public String toString() {
        return "Перевод на русский язык месяца - " + translation;
    }
}
