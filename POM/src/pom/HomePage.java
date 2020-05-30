package pom;

import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	// Get the User name from Home Page

	public String getHomePageDashboardUserName() {
		System.out.println("i am in homepage dashboard");
		String Title = driver.getTitle();// Title of webpage
		System.out.println(Title);
		return Title;

	}

}