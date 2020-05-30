package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class TestHome {
	WebDriver driver = new ChromeDriver();

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		String BaseURL = "file:///C:/My/Study/javaselenium/webpages/login.html";
		System.out.println("User is on Home Page");
		driver.get("file:///C:/My/Study/javaselenium/webpages/login.html");
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println("User is on Home Page success");
		assertEquals(url, BaseURL);
		System.out.println("completed");
	}

	//
	@Given("^User login a site$")
	public void user_login() throws Throwable {
		System.out.println("test User login a site ");

		String BaseURL = "file:///C:/My/Study/javaselenium/webpages/AlertPage.html";
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("root");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		assertEquals(url, BaseURL);

	}

	@Given("^User login a site with invalid user name$")
	public void user_login_invalid() throws Throwable {
		String BaseURL = "file:///C:/My/Study/javaselenium/webpages/AlertPage.html";
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("root123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Thread.sleep(5000);
		Alert ale = driver.switchTo().alert();
		Thread.sleep(5000);
		String s = ale.getText();
		System.out.println(s);
		ale.dismiss();
		assertTrue(s.contains("Invalid Password"));

	}

	@Given("^User closes the browser$")
	public void closeBrowser() throws Throwable {
		Thread.sleep(5000);
		driver.close();
	}

}
