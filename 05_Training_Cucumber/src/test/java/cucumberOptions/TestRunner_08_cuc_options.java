package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/features/08_dry_run.feature", glue = "stepDefinations", dryRun = true)
//public class TestRunner_08_cuc_options {
//
//}

// ========================

//@CucumberOptions(features = "src/test/java/features", glue = "stepDefinations", tags = "@PortalTest", strict = true, monochrome = true, plugin = {
//		"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cukes.xml" })
//public class TestRunner_08_cuc_options {
//
//}
// =========================
// monochrome = true for detailed and clean out put

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/features/08_cuc_options.feature", glue = "stepDefinations", dryRun = true, monochrome = false)
//public class TestRunner_08_cuc_options {
//
//}

// =====================
// strict =true it will fail the test if the test dont have any non implemented
// step
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/08_cuc_options.feature", glue = "stepDefinations", dryRun = true, monochrome = true, strict = true)
public class TestRunner_08_cuc_options {

}