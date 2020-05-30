package stepDefinition;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert; 

public class OutlineTest {
	WebDriver driver = null;
	int TOTAL;
@Given("^user navigates to Facebook$") 
	public void goToFacebook() 
	{ 
		driver = new ChromeDriver(); 
		driver.navigate().to("https://www.facebook.com/");
		} 
@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void I_enter_Username_as_and_Password_as(String arg1, String arg2) 
	{  driver.findElement(By.id("email")).sendKeys(arg1); 
	driver.findElement(By.id("pass")).sendKeys(arg2);
	driver.findElement(By.id("u_0_v")).click(); }
	
@Then("^login should be unsuccessful$") public void validateRelogin()
	{ 
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110"))
	{ System.out.println("Test Pass"); } 
	else { 
		System.out.println("Test Failed"); } 
	driver.close(); } 
	


//@When("^I user adds numbers \"([^\"]*)\" and \"([^\"]*)\"$")
//public void i_user_adds_numbers_and(String arg1, String arg2) throws Throwable {
//    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
//}

@When("^I user adds numbers (\\d+) and (\\d+)$")
public void i_user_adds_numbers_and(int arg1, int arg2) throws Throwable {

TOTAL=arg2+arg1;
System.out.println(TOTAL);
}


@Then("^result (\\d+) should be printed$")
public void result_should_be_printed(int arg1) throws Throwable {
	System.out.println(arg1);
	Assert.assertEquals(arg1,TOTAL);
}
private boolean equal(int arg1, int tOTAL2) {
	// TODO Auto-generated method stub
	return false;
}
}