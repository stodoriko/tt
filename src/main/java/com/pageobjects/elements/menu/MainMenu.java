package com.pageobjects.elements.menu;

import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static org.slf4j.LoggerFactory.getLogger;

@PageEntry(title = "Главное меню")
public class MainMenu extends HtmlElement {
    private Logger logger = getLogger(MainMenu.class);

    @ElementTitle("Log in")
    @FindBy(xpath = ".//*[contains(@id, 'username') and contains(text(), 'Log in')]")
    private TextInput mLogin;

}
