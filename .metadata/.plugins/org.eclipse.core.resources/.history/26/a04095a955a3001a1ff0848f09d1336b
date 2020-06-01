package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

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

		driver.get("file:///C:/My/Study/javaselenium/webpages/login.html");

	}

	/**
	 * 
	 * This test case will login in http://demo.guru99.com/V4/
	 * 
	 * Verify login page title as guru99 bank
	 * 
	 * Login to application
	 * 
	 * Verify the home page using Dashboard message
	 * 
	 * @throws InterruptedException
	 * 
	 */

	// @Test(priority = 0)
	//
	// public void test_Home_Page_Appear_Correct() {
	//
	// // Create Login Page object
	//
	// objLogin = new Login(driver);
	//
	// // Verify login page title
	//
	// String loginPageTitle = objLogin.getLoginTitle();
	//
	// Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	//
	// // login to application
	//
	// objLogin.loginToGuru99("mgr123", "mgr!23");
	//
	// // go the next page
	//
	// objHomePage = new HomePage(driver);
	//
	// // Verify home page
	//
	// Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger
	// id : mgr123"));
	//
	// }
	//
	@Test(priority = 1)

	public void test_Home_Page_Appear_inCorrect() throws InterruptedException {

		// Create Login Page object

		objLogin = new Login(driver);

		// Verify login page title

		String loginPageTitle = objLogin.getLoginTitle();
		System.out.println(loginPageTitle);
		Thread.sleep(5000);

		Assert.assertTrue(loginPageTitle.toLowerCase().contains("login paget"));

		Thread.sleep(5000);

		// login to application

		objLogin.loginToWeb("root", "root");

		Thread.sleep(5000);

		// go the next page

		objHomePage = new HomePage(driver);
		Thread.sleep(5000);

		// Verify home page

		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("testing select class"));

	}

	@AfterTest

	public void teardown() {

		driver.quit();
	}

}