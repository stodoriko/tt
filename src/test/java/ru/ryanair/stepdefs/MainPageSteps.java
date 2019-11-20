package ru.ryanair.stepdefs;

import com.pageobjects.pages.MainPage;
import ru.ryanair.AbstractSteps;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.exceptions.PageInitializationException;

public class MainPageSteps extends AbstractSteps {

    private MainPage getMainPage() throws PageInitializationException {
        return ((MainPage) PageFactory.getInstance().getCurrentPage());
    }


}
