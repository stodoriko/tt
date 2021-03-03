package ru.ryanair;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setSettings() {
        System.setProperty("webdriver.chrome.driver", "/Users/Sergey/IdeaProjects/todoriko/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.quit();
    }
}
