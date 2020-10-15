package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.HomePage;
import pom.Login;

public class LoginTest {

	WebDriver driver;

	Login objLogin;

	HomePage objHomePage;

	@BeforeTest

	public void setup() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///D:/Study/javaselenium/webpages/login.html");

	}

	@Test(priority = 1)

	public void test_Home_Page_Appear_inCorrect() throws InterruptedException {

		// Create Login Page object

		objLogin = new Login(driver);

		// Verify login page title

		String loginPageTitle = objLogin.getLoginTitle();
		System.out.println(loginPageTitle);
		Thread.sleep(3000);

		Assert.assertTrue(loginPageTitle.toLowerCase().contains("login paget"));

		Thread.sleep(3000);

		// login to application

		objLogin.loginToWeb("root", "root");

		Thread.sleep(3000);

		// go the next page

		objHomePage = new HomePage(driver);
		Thread.sleep(5000);
		String hometitle = objHomePage.getHomePageDashboardUserName().toLowerCase();
		// Verify home page

		Assert.assertTrue(hometitle.contains("testing select class"));

	}

	@AfterTest

	public void teardown() {

		driver.quit();
	}

}