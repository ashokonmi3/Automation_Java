package stepDefinations;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Step_def_03_data_driven {
	WebDriver driver = new ChromeDriver();
	int TOTAL;

	@When("^User sign up with following details$")
	public void user_sign_up_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.raw();
		System.out.println(obj);
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));

	}

	@Given("^user navigates to Facebook$")
	public void goToFacebook() throws InterruptedException {
		// driver = new ChromeDriver();
		driver.get("https://ashokonmi3.github.io/Selenium.Pages/login.html");
		Thread.sleep(5000);

	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void I_enter_Username_as_and_Password_as(String arg1, String arg2) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();

		Thread.sleep(5000);
		System.out.println("clicking on the button now");

		Thread.sleep(5000);
	}

	@Then("^login should be unsuccessful$")
	public void validateRelogin() {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://ashokonmi3.github.io/Selenium.Pages/AlertPage.html")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
	}

	@Then("^user closes the browser$")
	public void closebrowser() {
		driver.close();
	}

	// @When("^I user adds numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	// public void i_user_adds_numbers_and(String arg1, String arg2) throws
	// Throwable {
	// // Write code here that turns the phrase above into concrete actions
	// throw new PendingException();
	// }

	@When("^I user adds numbers (\\d+) and (\\d+)$")
	public void i_user_adds_numbers_and(int arg1, int arg2) throws Throwable {

		TOTAL = arg2 + arg1;
		System.out.println(TOTAL);
	}

	@Then("^result (\\d+) should be printed$")
	public void result_should_be_printed(int arg1) throws Throwable {
		System.out.println(arg1);
		Assert.assertEquals(arg1, TOTAL);
	}

	private boolean equal(int arg1, int tOTAL2) {
		// TODO Auto-generated method stub
		return false;
	}
}
