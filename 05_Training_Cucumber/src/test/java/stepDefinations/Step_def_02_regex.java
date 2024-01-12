package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Step_def_02_regex {

	// When User login into application with "jin" and password "1234"
	// When User login into application with "john" and password "4321"

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String arg1, String arg2)
			throws Throwable {
		System.out.println(arg1);
		System.out.println(arg2);

	}

	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}

	@When("^User login in to application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
		System.out.println(username);
		System.out.println(password);

	}

	WebDriver driver = new ChromeDriver();

	// User Ashok launching website www.yahoo.com
	// User Umesh launching website www.google.com

	@Given("^User (\\w+) launching website (.*)$")
	public void regeular_exp(String user, String url) throws Throwable {
		System.out.println("LAUNCHINT WEBSITE FOR " + user);
		String finalURL = "https://" + url;
		System.out.println(finalURL);
		Thread.sleep(3000);
		driver.get(finalURL);
		Thread.sleep(3000);
		String url1 = driver.getCurrentUrl();
		System.out.println("##########" + url1 + "############");
		Thread.sleep(3000);

	}
}
