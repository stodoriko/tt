package ru.ryanair.stepdefs;

import com.pageobjects.pages.AbstractPage;
import io.cucumber.java.bg.И;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.exceptions.PageInitializationException;
import ru.sbtqa.tag.pagefactory.extensions.WebExtension;

import static com.utils.ProjectUtils.sleep;

public class CommonSteps {

    private AbstractPage abstractPage() throws PageInitializationException {
        return (AbstractPage) PageFactory.getInstance().getCurrentPage();
    }

    @И("дождался подгрузки")
        public void waitFotLoad() {
        sleep(2);
        WebExtension.waitForPageToLoad();
    }
}
