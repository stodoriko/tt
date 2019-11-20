package ru.ryanair;

import com.pageobjects.pages.AbstractPage;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.exceptions.PageInitializationException;

public abstract class AbstractSteps {

    protected AbstractPage abstractPage() throws PageInitializationException {
        return (AbstractPage) PageFactory.getInstance().getCurrentPage();
    }
}
