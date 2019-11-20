package ru.ryanair.stepdefs;

import com.pageobjects.pages.AbstractPage;
import com.utils.ProjectUtils;
import io.cucumber.java.bg.И;
import io.cucumber.java.ru.Когда;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.exceptions.PageInitializationException;
import ru.sbtqa.tag.pagefactory.extensions.WebExtension;

import static com.utils.ProjectUtils.sleep;

public class CommonSteps {

    private AbstractPage abstractPage() throws PageInitializationException {
        return (AbstractPage) PageFactory.getInstance().getCurrentPage();
    }

    @Когда("^пользователь смотрит на экран (.*?) секунд$")
    public void watch(int seconds) {
        ProjectUtils.sleep(seconds);
    }

    @И("дождался подгрузки")
    public void waitFotLoad() {
        sleep(2);
        WebExtension.waitForPageToLoad();
    }

    @Когда("^пользователь нажимает кнопку \"(.*?)\"$")
    public void buttonClickOnPage(String elementTitle) throws PageInitializationException {
        abstractPage().click(elementTitle);
    }


}
