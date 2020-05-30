package CucumberJunitJava.CucumberJunitJava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/html" }

)
// @CucumberOptions(plugin = { "pretty", "html:target/html" }, tags = {
// "@SMOKETEST,@REGRESSION" }

// )

public class UserTestRunner {

}
