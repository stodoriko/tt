package ru.ryanair;

import com.pageobjects.pages.AbstractPage;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import static ru.sbtqa.tag.pagefactory.PageFactory.getWebDriver;
import static ru.sbtqa.tag.pagefactory.PageFactory.initElements;

@PageEntry(title = "Форма авторизации")
public class AuthorizationPage extends AbstractPage {

    private Logger logger;

    @ElementTitle(value = "domain")
    private TextInput domainInput;

    @ElementTitle(value = "Email")
    @FindBy(xpath = "//input[contains(@class, 'ng-valid-email')][ancestor::div[@class = 'dialog-body']]")
    private TextInput email;

    @ElementTitle(value = "Password")
    @FindBy(xpath = "//input[contains(@id, 'password')]")
    private TextInput passwordInput;

    public void initAuthorizationPage() {
        initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(getWebDriver())), this);
    }

    private AuthorizationPage domain(String domain) {
        if (domainInput.exists()) {
            domainInput.clear();
            domainInput.getWrappedElement().sendKeys(domain);
            logger.info("Domain was failed...");
        }
        return this;
    }

    private AuthorizationPage login(String login) {
        email.clear();
        email.getWrappedElement().sendKeys(login);
        logger.info("Login was failed...");
        return this;
    }

    private AuthorizationPage password(String password) {
        if (passwordInput.exists()) {
            passwordInput.clear();
            passwordInput.getWrappedElement().sendKeys(password);
            logger.info("Password was failed...");
        }
        return this;
    }

}
