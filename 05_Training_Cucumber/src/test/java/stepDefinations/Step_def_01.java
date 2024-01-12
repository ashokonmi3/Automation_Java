package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Step_def_01 {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		// code to navigate to login url
		System.out.println("navigated to login url");

	}

	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("deciding the browser to open");
	}

	@When("^Browser is triggered$")
	public void browser_is_triggered() throws Throwable {
		System.out.println("Browser is triggered");
	}

	@Then("^check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
		System.out.println("Browser is started");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		// code to login
		System.out.println("Logged in success");
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		// home page validation
		System.out.println("Validated home page");
	}
}