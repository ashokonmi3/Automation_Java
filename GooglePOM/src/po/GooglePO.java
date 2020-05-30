package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePO {
	private WebDriver driver;

	// method 1 using FindBy
	@FindBy(name = "q")
	public WebElement searchBar;

	public GooglePO(WebDriver driver) {
		// this is for non static method way
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// method 2 using static method
	public static WebElement searchButton(WebDriver driver) {
		return driver.findElement(By.xpath("//input[contains(@value,'Search')]"));
	}

	// method 2 using non static method
	public WebElement logoOnSearchResult() {
		return driver.findElement(By.xpath("//h1/a[@id='logo']"));
	}
}
