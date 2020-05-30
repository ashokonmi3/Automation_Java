package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Cuc_03_Regex_Step {
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

		// assertEquals(url, url1);
		// s.contains
	}

}
