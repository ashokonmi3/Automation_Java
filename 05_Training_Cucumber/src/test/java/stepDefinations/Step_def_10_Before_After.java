package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_def_10_Before_After {

	@Before
	// @Before will execute before every scenario.
	public void before() {
		System.out.println("########## Before #################");
	}

	@Given("^this is the first step$")
	public void This_Is_The_First_Step() {
		System.out.println("This is the first step");
	}

	@After
	public void cleanUp() {
		System.out.println("########## AFTER #################");

	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is the second step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is the third step");
	}

}