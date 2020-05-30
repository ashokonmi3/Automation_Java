package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/firstTest.feature", glue = { "stepDefinition" }, monochrome = false, tags = {
		" @REGRESSIONTEST" }
// ,tags= {"~@SMOKETEST"}

// @Cucumber.Options(tags = {"@reg","@temp"})

)

public class FirstTest {

}
