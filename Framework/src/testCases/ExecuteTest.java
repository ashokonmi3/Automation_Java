package testCases;

import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import excelExportAndFileIO.ReadExcelFile;
import operation.ReadObject;
import operation.UIOperation;

public class ExecuteTest {
	@Test
	public void testLogin() throws Exception {
		// TODO Auto-generated method stub
		WebDriver webdriver = new ChromeDriver();
		ReadExcelFile file = new ReadExcelFile();
		ReadObject object = new ReadObject();
		Properties allObjects = object.getObjectRepository();
		UIOperation operation = new UIOperation(webdriver);
		// Read keyword sheet
		Sheet TestSheet = file.readExcel(System.getProperty("user.dir") + "\\", "TestCase.xlsx", "Sheet1");

		// Find number of rows in excel file
		int rowCount = TestSheet.getLastRowNum() - TestSheet.getFirstRowNum();
		// Create a loop over all the rows of excel file to read it
		System.out.println(rowCount);
		for (int i = 1; i < rowCount + 1; i++) {
			System.out.println("loop");

			// Loop over all the rows
			Row row = TestSheet.getRow(i);
			System.out.println("before if condition");

			// Check if the first cell contain a value, if yes, That means it is the new
			// testcase name
			// System.out.println(row.getCell(0) == null);
			if (row.getCell(0) == null) {
				System.out.println("inside if condition");

				System.out.println("i am in loop");
				// Print testcase detail on console

				if (row.getCell(2) == null) {
					System.out.println(row.getCell(1).toString() + "----" + row.getCell(4).toString());
					operation.perform(allObjects, row.getCell(1).toString(), null, null, row.getCell(4).toString());
				}

				else if (row.getCell(4) == null) {
					System.out.println(row.getCell(1).toString() + "----" + row.getCell(2).toString() + "----"
							+ row.getCell(3).toString());

					operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
							row.getCell(3).toString(), null);
				}
				// System.out.println(row.getCell(1).toString() + "----" +
				// row.getCell(4).toString());

				// Call perform function to perform operation on UI
				// operation.perform(allObjects, row.getCell(1).toString(),
				// row.getCell(3).toString(),
				// row.getCell(4).toString());
				// if (row.getCell(4).toString() == null) {
				// operation.perform(allObjects, row.getCell(1).toString(),
				// row.getCell(2).toString(),
				// row.getCell(3).toString(), null);
				// } else {
				// operation.perform(allObjects, row.getCell(1).toString(),
				// row.getCell(2).toString(),
				// row.getCell(3).toString(), row.getCell(4).toString());
				// }
				// System.out.println(row.getCell(4) == null);
				else {
					operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
							row.getCell(3).toString(), row.getCell(4).toString());

				}
			} else {
				// Print the new testcase name when it started
				System.out.println("inside else condition");

				System.out.println("New Testcase->" + row.getCell(0).toString() + " Started");
			}
		}
	}
}