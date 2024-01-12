package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/01_First_Feature.feature", glue = "stepDefinations")
public class TestRunner_01 {

}
// ============================
// If you want to execute all the feature files together give feature file
// package name
// @RunWith(Cucumber.class)
// @CucumberOptions(features = "src/test/java/features/", glue =
// "stepDefinations")
// public class TestRunner_01 {
//
// }
