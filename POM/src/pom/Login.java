package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	By userName = By.name("username");
	By password = By.name("password");
	// driver.findElement(By.name("username").sendKeys(strUserName);
	// driver.findElement(userName).sendKeys(strUserName);

	By titleText = By.linkText("Google");
	By login = By.xpath("/html/body/form/input[3]");

	public Login(WebDriver driver) {

		this.driver = driver;

	}

	// Set user name in textbox

	public void setUserName(String strUserName) {

		driver.findElement(userName).sendKeys(strUserName);

	}

	// Set password in password textbox

	public void setPassword(String strPassword) {

		driver.findElement(password).sendKeys(strPassword);

	}

	// Click on login button

	public void clickLogin() {

		driver.findElement(login).click();

	}

	// Get the title of Login Page

	public String getLoginTitle() {

		// return driver.findElement(titleText).getText();
		String Title = driver.getTitle();
		return Title;

	}

	/**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 *                        user name passed
	 * 
	 * @param strPasword
	 *                        password passed
	 * 
	 * @return nothing
	 * 
	 */

	public void loginToWeb(String strUserName, String strPasword) {

		// Fill user name ("root","root")

		this.setUserName(strUserName);

		// Fill password

		this.setPassword(strPasword);

		// Click Login button

		this.clickLogin();

	}

}