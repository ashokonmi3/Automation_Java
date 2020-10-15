package tng.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TNG_17_ExtendedReports {
	static ExtentTest test;
	static ExtentReports report;
	static WebDriver driver;

	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
		driver = new ChromeDriver();

	}

	@Test
	public void extentReportsDemo() {
		// WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		if (driver.getTitle().equals("Google")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}

	@Test
	public void extentReportsDemo1() {
		// WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		if (driver.getTitle().equals("Google1")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}

	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
		driver.close();
	}
}
