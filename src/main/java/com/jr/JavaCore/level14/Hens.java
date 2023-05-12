package com.jr.JavaCore.level14;

//      Давай напишем Фабрику (Factory) по производству кур (Hen):
//        1. Создай класс Hen.
//           а) Сделай его абстрактным.
//           б) Добавь в класс абстрактный метод int getCountOfEggsPerMonth().
//           в) Добавь в класс метод String getDescription(), который возвращает строку "Я - курица.".
//        Создай класс RussianHen, который наследуется от Hen.
//        Создай класс UkrainianHen, который наследуется от Hen.
//        Создай класс MoldovanHen, который наследуется от Hen.
//        Создай класс BelarusianHen, который наследуется от Hen.
//        В каждом из четырех последних классов напиши свою реализацию метода getCountOfEggsPerMonth.
//        Методы должны возвращать количество яиц в месяц от данного типа куриц.
//        В каждом из четырех последних классов напиши свою реализацию метода getDescription.
//      Методы должны возвращать строку вида:
//      <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
//        где Sssss - название страны
//        где N - количество яиц в месяц
//
//        В классе HenFactory реализуй метод getHen, который возвращает соответствующую стране породу кур.
//        Все созданные классы должны быть в отдельных файлах.

import static com.tt.java_1.Static.Human.getDescription;

public class Hens {

    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country) {
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    break;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    break;
                case Country.MOLDAVIA:
                    hen = new MoldavianHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkranianHen();
                    break;
            }
            return hen;
        }
    }

    public abstract static class Hen {
        public abstract int getCountOfEggsPerMonth();

        public String getDescription() {
            return "Я - курица.";
        }
    }

    public static class RussianHen extends Hen {

        @Override
        public int getCountOfEggsPerMonth() {
            return 12;
        }

        @Override
        public String getDescription() {
            return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц." +
                    Country.RUSSIA, getCountOfEggsPerMonth());
        }
    }

    public static class UkranianHen extends Hen {

        @Override
        public int getCountOfEggsPerMonth() {
            return 8;
        }

        @Override
        public String getDescription() {
            return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц." +
                    Country.UKRAINE, getCountOfEggsPerMonth());
        }
    }

    public static class MoldavianHen extends Hen {

        @Override
        public int getCountOfEggsPerMonth() {
            return 9;
        }

        @Override
        public String getDescription() {
            return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц." +
                    Country.MOLDAVIA, getCountOfEggsPerMonth());
        }
    }

    public static class BelarusianHen extends Hen {

        @Override
        public int getCountOfEggsPerMonth() {
            return 10;
        }

        @Override
        public String getDescription() {
            return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц." +
                    Country.BELARUS, getCountOfEggsPerMonth());
        }
    }

    public interface Country {
        String BELARUS = "Belarus";
        String RUSSIA = "Russia";
        String MOLDAVIA = "Moldova";
        String UKRAINE = "Ukraine";
    }
}