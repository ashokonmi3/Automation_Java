package tng.framework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

// code to be run on the grid
public class gridtest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

		try {
			System.out.println("starting");

			RemoteWebDriver driver;

			String baseURL, nodeURL;

			baseURL = "https://www.gmail.com";
			nodeURL = "http://localhost:5000/wd/hub";
			DesiredCapabilities capability = DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.ANY);
			driver = new RemoteWebDriver(new URL(nodeURL), capability);
			driver.get(baseURL);
			//
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			// Assert.assertEquals(pageTitle, "Gmail");
			Thread.sleep(3000);
			driver.quit();
			System.out.println("done");
			//
		} catch (Exception e) {
			System.out.println("not done");

		}
	}

}
