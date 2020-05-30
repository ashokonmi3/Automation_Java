package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.IntializeBrowser;

public class HomePagePO extends IntializeBrowser {
	/**
	 * @author user
	 * @return WebElement
	 */
	public static WebElement searchBar() {
		return browser.findElement(By.name("q"));
	}

	/**
	 * @author user
	 * @return WebElement
	 */
	public static WebElement searchButton() {
		return browser.findElement(By.xpath("//input[contains(@value, 'Search')]"));
	}

	/**
	 * @author user
	 * @return WebElement
	 */
	public static WebElement googleBanner() {
		return browser.findElement(By.id("hplogo"));
	}
}