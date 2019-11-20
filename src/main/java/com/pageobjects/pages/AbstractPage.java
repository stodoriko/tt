package com.pageobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.exceptions.PageException;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import static com.utils.ProjectUtils.isElementVisible;
import static com.utils.ProjectUtils.jsScrollToElement;
import static ru.sbtqa.tag.pagefactory.PageFactory.getWebDriver;
import static ru.sbtqa.tag.pagefactory.PageFactory.initElements;
import static ru.sbtqa.tag.pagefactory.extensions.WebExtension.waitForPageToLoad;

public abstract class AbstractPage extends Page {
    private Logger logger = LoggerFactory.getLogger(AbstractPage.class);

    @FindBy(xpath = ".//*[contains(@class, 'homepage')]")
    private MainPage mainPage;

    @FindBy(xpath = ".//*[contains(@class, 'signup-modal')]")
    private AuthorizationModal authorizationModal;

    public AbstractPage() {
        waitForPageToLoad();
        initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(getWebDriver())), this);
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public AuthorizationModal getAuthorizationModal() {
        return authorizationModal;
    }

    public void click(String elementTitle) {
        WebElement webElement = null;
        try {
            webElement = this.getElementByTitle(elementTitle);
        } catch (PageException e) {
            logger.info(String.valueOf(e));
        }
        if (isElementVisible(webElement, 10)) {
            jsScrollToElement(webElement);
        }
        logger.info("Клик по элементу: {}", elementTitle);
    }

}
