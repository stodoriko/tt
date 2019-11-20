package com.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;
import static ru.sbtqa.tag.pagefactory.PageFactory.getWebDriver;

public abstract class ProjectUtils {

    private static Logger logger = getLogger(ProjectUtils.class);

    private ProjectUtils() {
        super();
    }

    public static void sleep(int seconds) {
        try {
            if (seconds > 10) {
                logger.info("Sleep {}", seconds);
            }
            Thread.sleep(seconds * 1000L);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    public static void confirmSSLError() {
        if (getWebDriver().getCurrentUrl().contains("SSLError")) {
            logger.info("Solving ssl error...");
            long startTime = System.currentTimeMillis();
            getWebDriver().navigate().to("javascript:document.getElementById('overridelink').click();");
            long wastedTime = System.currentTimeMillis() - startTime;
            logger.info("SSL error was solved", getTime(wastedTime / 1000).contains("0h 0m 0s") ? "" : " (wastwd time: " + getTime(wastedTime / 1000) + ")");
        }
    }

    public static String getTime(long wastedSeconds) {
        long hours = wastedSeconds / 3600;
        long minutes = (wastedSeconds % 3600) / 60;
        long seconds = wastedSeconds % 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static boolean isElementVisible(WebElement element, int timeout) {
        try {
            waitForVisibility(element, timeout);
            return true;
        } catch (TimeoutException text) {
            logger.debug(String.valueOf(text));
            return false;
        }
    }

    public static WebElement waitForVisibility(WebElement element, int seconds) {
        return new WebDriverWait(getWebDriver(), seconds)
                .until(ExpectedConditions
                        .visibilityOf(element));
    }

    public static void jsScrollToElement(WebElement element) {
        executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void executeScript(String script, WebElement element) {
        ((JavascriptExecutor) getWebDriver()).executeScript(script, element);
    }
}
