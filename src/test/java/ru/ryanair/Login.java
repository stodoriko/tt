package ru.ryanair;

import org.junit.Assert;
import org.junit.Test;

public class Login extends WebDriverSettings{

    @Test
    public void login() {
        driver.get("https://www.ryanair.com/gb/en");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Official Ryanair website | Book direct for the lowest fares | Ryanair.com"));
        driver.quit();
    }

}
