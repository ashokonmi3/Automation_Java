package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/features/05_tag.feature", tags = "@WebTest", glue = "stepDefinations")
//public class TestRunner_05_tags {
//
//}

// =====================
// Not operator ~
//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/features/05_tag.feature", tags = "~@WebTest", glue = "stepDefinations")
//public class TestRunner_05_tags {
//
//}
// ===================
// and operator It will execute tags which has both @webtest and @mobiletest
//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/features/05_tag.feature", tags = { "@WebTest",
//		"@MobileTest" }, glue = "stepDefinations")
//public class TestRunner_05_tags {

//}
// ===================
// Or tag
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/05_tag.feature", tags = {
		"@WebTest,@MobileTest" }, glue = "stepDefinations")
public class TestRunner_05_tags {

}
// ==================
// complete execution
// @RunWith(Cucumber.class)
// @CucumberOptions(features = "src/test/java/features/", tags = {
// "@WebTest,@MobileTest" }, glue = "stepDefinations")
// public class TestRunner_05_tags {

// }