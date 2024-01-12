package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Step_def_6_hook {

	@Before
	public void beforeScenario() {
		System.out.println("This will run before the Scenario");
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after the Scenario");
	}

	@Given("^this is the first step for hook$")
	public void hook_first() {
		System.out.println("This is the first step");
	}

	@When("^this is the second step for hook$")
	public void hook2() {
		System.out.println("This is the second step");
	}

	@Then("^this is the fourth step for hook$")
	public void hook3() {
		System.out.println("This is the third step");
	}
}