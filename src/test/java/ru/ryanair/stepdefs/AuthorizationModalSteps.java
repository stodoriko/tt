package ru.ryanair.stepdefs;

import com.pageobjects.pages.AuthorizationModal;
import ru.ryanair.AbstractSteps;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.exceptions.PageInitializationException;

public class AuthorizationModalSteps extends AbstractSteps {

    private AuthorizationModal getAuthorizationModalPage() throws PageInitializationException {
        return ((AuthorizationModal) PageFactory.getInstance().getCurrentPage());
    }
}
