package selenium;

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEL_19_Brokenimages {

	public static void main(String[] args) {
		int invalidImageCount = 0;

		WebDriver driver = new ChromeDriver();
		driver.get("http://hc.apache.org/downloads.cgi");

		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("Total no. of images are " + imagesList.size());

		for (WebElement imgElement : imagesList) {
			System.out.println(imgElement.getAttribute("src"));
			if (imgElement != null) {
				try {
					HttpClient client = HttpClientBuilder.create().build();
					HttpGet request = new HttpGet(imgElement.getAttribute("src"));
					HttpResponse response = client.execute(request);

					// verifying response code he HttpStatus should be 200 if not,
					// increment as invalid images count

					if (response.getStatusLine().getStatusCode() != 200)
						invalidImageCount++;

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
		System.out.println("Broken images " + invalidImageCount);

	}
}