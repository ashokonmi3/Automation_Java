package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/Cuc_03_Regex.feature", glue = { "stepDefinition" }, monochrome = false)
public class Cuc_03_Regex_Runner {

}
