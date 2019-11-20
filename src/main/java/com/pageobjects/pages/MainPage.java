package com.pageobjects.pages;

import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.element.Link;

@PageEntry(title = "Главная страница")
public class MainPage extends AbstractPage{

    private Logger logger = LoggerFactory.getLogger(MainPage.class);

    @ElementTitle(value = "Login")
    @FindBy(xpath = "//*[contains(@class, 'username')]")
    private Link login;

    public MainPage() {
        getMainPage();
    }

}
