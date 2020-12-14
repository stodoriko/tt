package ru.ryanair.stepdefs;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import org.junit.Assert;

import java.math.BigDecimal;

public class MyStepdefs {

    private static BigDecimal cash = new BigDecimal(120000);

    @Когда("^пользователь снимает со счёта (.*?) рублей$")
    public void subtract(int arg0) {
        cash = cash.subtract(new BigDecimal(arg0));
    }

    @Дано("^на счёте пользователя имеется (.*?) рублей$")
    public void fullSum(int arg0) {
        Assert.assertEquals(cash.compareTo(new BigDecimal(arg0)), 0);
    }
}
