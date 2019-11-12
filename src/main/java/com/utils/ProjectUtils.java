package com.utils;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;
import static ru.sbtqa.tag.pagefactory.PageFactory.getWebDriver;

public abstract class ProjectUtils {

    private static Logger logger = getLogger(ProjectUtils.class);

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
        long minutes= (wastedSeconds % 3600) / 60;
        long seconds = wastedSeconds % 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}
