package tests;

import static base.IntializeBrowser.browser;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lib.HomePageLib;

public class HomePageTest {

	HomePageLib hpLib = new HomePageLib();

	@BeforeClass
	public void setUp() {
		browser.get("https://google.com");
	}

	@Test
	public void searchGoogleTest() {
		hpLib.searchGoogle("first test with POM");
	}

	@AfterClass
	public void tearDown() {
		browser.quit();
	}
}