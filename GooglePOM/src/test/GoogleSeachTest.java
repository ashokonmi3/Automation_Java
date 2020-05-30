package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import po.GooglePO;

public class GoogleSeachTest {
	public static void main(String[] args) {
		// set gecko driver.exe file path
		// create object for browser
		WebDriver driver = new ChromeDriver();
		// navigate to google
		driver.get("https://google.com");

		// create object for GooglePO class
		GooglePO gp = new GooglePO(driver);
		// access searchBar page object from GooglPO PO class
		gp.searchBar.sendKeys("POM test");

		// accessing static method
		GooglePO.searchButton(driver).click();

		// access non static method using object of GooglePO class
		gp.logoOnSearchResult().click();
	}
}