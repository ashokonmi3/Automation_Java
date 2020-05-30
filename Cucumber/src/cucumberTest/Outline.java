package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/Outline.feature", glue = { "stepDefinition" }, monochrome = true, plugin = {
		"pretty", "html:Cucumber/Reports" }
// ,tags= {"@SMOKETEST"}
// ,tags= {"~@SMOKETEST"}

// @Cucumber.Options(tags = {"@reg","@temp"})

)

public class Outline {

}
