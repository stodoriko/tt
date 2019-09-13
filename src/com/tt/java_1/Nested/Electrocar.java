package com.tt.java_1.Nested;

public class Electrocar {

    private int id;

    // Нестатический вложенный класс
    public class Motor {
        public void startMotor() {
            System.out.println("Запуск двигателя " + id);
        }
    }

    // Статический вложенный класс
    public static class Battery {
        public void charged() {
            System.out.println("Батарея заряжается");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1; // Только константа

        // Вложенный класс внутри метода
        class SomeDetail {
            public void someDetail() {
                // Имеем доступ к обеим переменным
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeDetail someDetail = new SomeDetail();
        test(someDetail);

        System.out.println("Электромашина " + id + " запускается..");
    }

    private  void test(Object object) {

    }
}
