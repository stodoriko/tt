package com.pageobjects.pages;

import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Главная страница")
public class MainPage extends AbstractPage{

    @FindBy(xpath = "")
    private mainMenu;

}
