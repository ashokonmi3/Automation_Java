package featurefile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "stepDefinition" }, monochrome = false)
// tags = { " @REGRESSIONTEST" }
// ,tags= {"~@SMOKETEST"}

// @Cucumber.Options(tags = {"@reg","@temp"})

// )
//
public class Cuc_01_FirstTest_Runner {

}
