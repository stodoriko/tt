package ru.ryanair;

import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Форма авторизации")
public class AuthorizationPage {

    @FindBy(xpath = "//input[contains(@class, 'ng-valid-email')][ancestor::div[@class = 'dialog-body']]")
    private TextInput email;


}
