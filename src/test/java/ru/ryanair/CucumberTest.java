package ru.ryanair;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class CucumberTest {

    @RunWith(Cucumber.class)
    @CucumberOptions(
            monochrome = true,
            features = "src/test/resources/features",
            glue = "ru.",
            tags = {"@authorization"},
            snippets = SnippetType.CAMELCASE
    )
    public class RunnerTest {
    }
}
