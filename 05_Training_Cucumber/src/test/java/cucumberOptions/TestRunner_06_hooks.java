package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/06_hook.feature", glue = "stepDefinations")
public class TestRunner_06_hooks {

}

// In the world of testing, you must have encountered the situations where
// you need to perform the prerequisite steps before testing any test scenario.
// This prerequisite can be anything from:
//
// Starting a webdriver
// Setting up DB connections
// Setting up test data
// Setting up browser cookies
// Navigating to certain page
// or anything before the test
//
// In the same way, there are always after steps as well of the tests like:
//
// Killing the webdriver
// Closing DB connections
// Clearing the test data
// Clearing browser cookies
// Logging out from the application
// Printing reports or logs
// Taking screenshots on error
// or anything after the test