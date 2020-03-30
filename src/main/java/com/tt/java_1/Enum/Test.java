package com.tt.java_1.Enum;

public class Test {
    public static void main(String[] args) {
        Month month = Month.APRILL;
        System.out.println(month.getTranslation());
        System.out.println("---");
        System.out.println(month);
        System.out.println(month.getTemperature());
        System.out.println(month.getInfo());
        System.out.println("---");
        // Возвращает название энама в виде строки, так как он задекларирован
        System.out.println(month.name());

        // valueOf
        Month aprill = Month.valueOf("APRILL");
        System.out.println(aprill.getTranslation());

        // Показывает порядковый номер перечисленных объектов
        System.out.println(aprill.ordinal());


        // Проверка на то, является ли объектом класса Month
        System.out.println(month instanceof Month);
        System.out.println(month.getClass());

        switch (month) {
            case APRILL:
                System.out.println("Серёжка, скоро др.");
                break;
            case MAY:
                System.out.println("Весна началась!");
                break;
        }
    }
}
