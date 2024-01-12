package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/03_DataDriven.feature", glue = "stepDefinations")
public class TestRunner_03_Datadriven {

}
