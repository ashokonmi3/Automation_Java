package locator;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		// String s = driver.getPageSource();
		// System.out.println(s);
		// driver.findElement(By.name)
		WebElement we;
		try {
			we = driver.findElement(By.name("uploaded_file"));
			we.click();

		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();

		}

		// we.click();
		// // driver.findElement(
		// //
		// By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]"))
		// // .click();
		Thread.sleep(5000);
		//
		// // below line execute the AutoIT script .
		Runtime.getRuntime().exec("C:\\My\\P\\Study\\javaselenium\\Autoit\\FileUpload.exe");
		Thread.sleep(5000);
		//
		driver.close();

	}
}