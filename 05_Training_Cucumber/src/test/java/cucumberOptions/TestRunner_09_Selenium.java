package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/09_SeleniumTest.feature", glue = "stepDefinations")
public class TestRunner_09_Selenium {

}
