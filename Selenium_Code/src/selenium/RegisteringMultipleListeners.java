package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class RegisteringMultipleListeners {
	public static void main(String... args) {

		WebDriver driver = new ChromeDriver();
		EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
		IAmTheEventListener eventListener = new IAmTheEventListener();
		IAmTheEventListener2 eventListener2 = new IAmTheEventListener2();

		eventFiringDriver.register(eventListener);
		eventFiringDriver.register(eventListener2);

		eventFiringDriver.get("http://www.google.com");
		eventFiringDriver.get("http://www.facebook.com");

		eventFiringDriver.navigate().back();
	}
}
