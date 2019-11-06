package ru.ryanair;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "/Users/Ольга/AFTSoft/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ryanair.com/gb/en/");
    }

}
