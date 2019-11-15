package ru.ryanair;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.cucumber.TagCucumber;

@RunWith(TagCucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "src/test/resources/features",
        glue = "ru.ryanair.stepdefs",
        tags = {"@authorization"}
)
public class CucumberTest {
}



