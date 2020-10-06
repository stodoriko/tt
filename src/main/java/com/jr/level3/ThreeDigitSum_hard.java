package com.jr.level3;

public class ThreeDigitSum_hard {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(54661));
    }

    public static int sumDigitsInNumber(int number) {
        int countDig = Integer.toString(number).length();
        int sum = 0;
        int l = countDig;

        for (int i = 0; i < countDig; i++) {
            int sumTemp;
            switch (l) {
                case 1:
                    sumTemp = number;
                    sum = sum + sumTemp;
                    number = number - sumTemp;
                    l--;
                    break;
                case 2:
                    sumTemp = number / 10;
                    sum = sum + sumTemp;
                    number = number - (sumTemp * 10);
                    l--;
                    break;
                case 3:
                    sumTemp = number / 100;
                    sum = sum + sumTemp;
                    number = number - (sumTemp * 100);
                    l--;
                    break;
                case 4:
                    sumTemp = number / 1000;
                    sum = sum + sumTemp;
                    number = number - (sumTemp * 1000);
                    l--;
                    break;
                case 5:
                    sumTemp = number / 10000;
                    sum = sum + sumTemp;
                    number = number - (sumTemp * 10000);
                    l--;
                    break;
            }
        }
        return sum;
    }
}
