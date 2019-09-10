package com.oreilly.SeaBattle;

public class SimpleDotComTestDrive {
    public static void main(String[] args) throws NumberFormatException {

        int numOfGuess = 0; // переменная для количества ходов пользователя
        String resultUserInput = null;

        GameHelper helper = new GameHelper();


        SimpleDotCom simpleDotCom = new SimpleDotCom();
        // Генерируем случайное число для первой ячейки и используем его для формирования массива ячеек.
        int randomNum = (int) (Math.random() * 5);
        int[] lacations = {randomNum, randomNum + 1, randomNum + 2};
        // int[] locations = {2,3,4};
        // Передаём в массив местоположение ячеек
        simpleDotCom.setLocationCells(lacations);


        boolean isAlive = true; // Создаём переменную, чтобы проверять, не закончилась ли игра.

        while (isAlive == true) {
            // Получаем строку вводимую пользователем
            while (resultUserInput == null) {
                System.out.println(resultUserInput);
                String userInput = helper.getUserInput("Введите число");
                resultUserInput = simpleDotCom.checkYourSelf(userInput);
                numOfGuess++;
                if (resultUserInput.equals("Потопил")) {
                    isAlive = false;
                    System.out.println("Вам потребовалась" + numOfGuess + " попыток(ки)");
                }
            }
        }
    }
}
