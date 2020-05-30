package DataDriven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FWRK_01_DatadrivenTest {
	public WebDriver driver;

	@Test(dataProvider = "testdata")
	public void login(String username, String password) {
		driver = new ChromeDriver();
		driver.get("file:///C:/My/Study/javaselenium/webpages/login.html");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Assert.assertEquals("file:///C:/My/Study/javaselenium/webpages/AlertPage.html", driver.getCurrentUrl());
		driver.close();
	}

	@DataProvider(name = "testdata")
	public Object[][] readExcel() throws BiffException, IOException {
		File f = new File("C:\\My\\users\\eclipse-workspace\\Framework\\src\\DataDriven\\Input.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int rows = s.getRows();
		int columns = s.getColumns();
		System.out.println(rows);
		System.out.println(columns);
		String inputData[][] = new String[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Cell c = s.getCell(j, i);// Returns the cell specified at this row and at this column.
				inputData[i][j] = c.getContents();
				System.out.println(inputData[i][j]);
			}
		}
		return inputData;
	}
}