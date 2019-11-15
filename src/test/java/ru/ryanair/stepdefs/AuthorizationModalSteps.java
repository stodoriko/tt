package ru.ryanair.stepdefs;

import com.pageobjects.pages.AuthorizationModal;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.exceptions.PageInitializationException;

public class AuthorizationModalSteps {

    private AuthorizationModal getAuthorizationPage() throws PageInitializationException {
        return ((AuthorizationModal) PageFactory.getInstance().getCurrentPage());
    }
}
