package ru.ryanair;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = ("src/test/resources/features"),
        glue = "ru.ryanair.stepdefs",
        tags = {"@all"}
)
public class CucumberTest {
}



