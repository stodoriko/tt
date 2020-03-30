package com.tt.java_1.Anonim;

public class Test {
    public static void main(String[] args) {

        // Здесь создаётся не объект интерфейса, а создаётся класс, который реализует методы интерфейса.
        // Но не надо создавать отдельный класс, который реализует интерфейс.
        // Он создаётся как бы сам, затем реализует интерфейс и мы имеем возможность переопределить метод,
        // и объект созданного класса присваеивается интерфейсу.

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Кто-то кушает");
            }
        };
        ableToEat.eat();
    }
}
