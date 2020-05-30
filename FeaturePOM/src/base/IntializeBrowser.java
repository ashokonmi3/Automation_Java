package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import data.PropertiesData;

public class IntializeBrowser extends InitializeLogging {
	// this browser variable will be used through the framework
	public static EventFiringWebDriver browser;

	public static void main(String[] args) throws Exception {
		// initialize driver
		WebDriver driver = initializeDriver();
		// Create object for Listener implementation
		ListenerHelper listen = new ListenerHelper();
		// create object event listener object
		browser = new EventFiringWebDriver(driver);
		// register even listener object
		browser.register(listen);

	}

	private static WebDriver initializeDriver() throws Exception {
		WebDriver driver = null;
		PropertiesData pd = new PropertiesData();
		String propertiesFilePath = "C:\\Users\\user\\workspace1\\FeaturePOM\\src\\files\\input\\config.properties";
		String browserToChoose = pd.readProperty(propertiesFilePath, "browser");
		log.info("Trying to browser : " + browserToChoose);
		if (browserToChoose.equalsIgnoreCase("firefox") || browserToChoose.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();

		} else if (browserToChoose.equalsIgnoreCase("chrome") || browserToChoose.equalsIgnoreCase("gc")) {
			driver = new ChromeDriver();
		} else if (browserToChoose.equalsIgnoreCase("internet explorer") || browserToChoose.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		}
		log.info(browserToChoose + " browser opened successfully");
		return driver;
	}
}