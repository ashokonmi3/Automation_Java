package corejavapackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

//public class O00020_Filehandling {
//
//	public static void main(String[] args) throws IOException {
//
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//
//		File fileObject = new File(currentDirectory + "\\CreateDir");// Create a
//		// Folder
//
//		fileObject.mkdir();
//
//		boolean a = fileObject.exists();// Check the existence of Folder.
//
//		if (a == true) {
//			System.out.println("Folder Exists");
//		} else {
//			System.out.println("Folder Not Exists");
//		}
//
//	}
//}
// ============================
//public class O00020_Filehandling {
//
//	public static void main(String[] args) throws IOException {
//
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//
//		File fileObject = new File(currentDirectory + "\\CreateDir");// Create a
//		// Folder
//
//		fileObject.delete();
//	}
//}
// ==================================
//public class O00020_Filehandling {
//	public static void main(String[] args) throws IOException {
//		// // Create a Text File
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		File fileObject = new File(currentDirectory + "\\file.txt");
//		fileObject.createNewFile();
//		FileWriter fw = new FileWriter(currentDirectory + "\\file.txt");
//		fw.write("Welcome to java.");
//		fw.write("Welcome to selenium.");
//		fw.close();
//		try {
//			File myObj = new File(currentDirectory + "\\file.txt");
//			Scanner myReader = new Scanner(myObj);
//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println(data);
//			}
//			myReader.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//		}
//		//
//	}
//}

// ===========================
//public class O00020_Filehandling {
//
//	public static void main(String[] args) throws IOException {
//
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		File fileObject = new File(currentDirectory + "\\file.txt");
//		fileObject.delete();// Delete a Text File
//	})
//}
// ======================================
// Reading single character
//public class O00020_Filehandling {
//	public static void main(String args[]) {
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		String filepath = currentDirectory + "\\out.txt";
//		try {
//			FileInputStream fin = new FileInputStream(filepath);
//			int i = fin.read();
//			System.out.print((char) i);
//			fin.close();
//			System.out.println("  success...");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}
// ====================
// Reading all characters
//public class O00020_Filehandling {
//	public static void main(String args[]) {
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		String filepath = currentDirectory + "\\out.txt";
//		try {
//			FileInputStream fin = new FileInputStream(filepath);
//			int i = 0;
//			while ((i = fin.read()) != -1) {
//				System.out.print((char) i);
//			}
//			fin.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}
// ========================
/*
 * excel file
 * 
 */
//public class O00020_Filehandling {
//	public static void main(String[] args) throws Exception {
//		// create file input stream object for the excel sheet
//		XSSFWorkbook workbook;
//		XSSFSheet sheet;
//		XSSFCell cell;
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//
//		FileInputStream fis = new FileInputStream(currentDirectory + "\\test.xlsx");
//		// create object for work book
//		workbook = new XSSFWorkbook(fis);
//		// create object for sheet present in excel using Workbook object 'wb'
//		sheet = workbook.getSheetAt(0);
//		// create object for row present in sheet using Sheet object 'sheet'
//		Row row = sheet.getRow(0);
//		// create object for cell present in row using Row object 'row'
//		Cell cell1 = row.getCell(0);
//		// print the value present in the excel sheet
//		System.out.println(cell1.getStringCellValue());
//	}
//}
// ====================================

//public class O00020_Filehandling {
//	public static void main(String[] args) throws Exception {
//		// create file input stream object for the excel sheet
//		String currentDirectory = System.getProperty("user.dir");
//
//		File file = new File(currentDirectory + "\\WriteExcel.xlsx"); // creating a
//		// new file instance
//		FileInputStream fis = new FileInputStream(file); // obtaining bytes from the
//		// file
//		// creating Workbook instance that refers to .xlsx file
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		XSSFSheet sheet = wb.getSheetAt(0);
//		Iterator<Row> itr = sheet.iterator(); // iterating over excel file
//		while (itr.hasNext()) {
//			Row row = itr.next();
//			Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each
//			// column
//			while (cellIterator.hasNext()) {
//				Cell cell = cellIterator.next();
//				switch (cell.getCellType()) {
//				case STRING: // field that represents string cell type
//					System.out.print(cell.getStringCellValue() + "\t\t\t\t");
//					break;
//				case NUMERIC: // field that represents number cell type
//					System.out.print(cell.getNumericCellValue() + "\t\t\t");
//					break;
//				default:
//				}
//			}
//			System.out.println("");
//		}
//	}
//}

// ================================
class O00020_Filehandling {
	public static void main(String[] args) {
		String txtFileName = "C:/My/P/Study/CoreJava/C2ImportCalEventSample.csv";
		try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {

			stream.forEach(System.out::println);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		//
	}
}

// ===============================
// class O00020_Filehandling {
//
// public static void main(String[] args) {
// String txtFileName = "C:/My/P/Study/CoreJava/C2ImportCalEventSample.csv";
//
// try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {
//
// stream.forEach(System.out::println);
//
// } catch (IOException ioe) {
// ioe.printStackTrace();
// }
//
// }
// }
// ========================

// public class O00020_Filehandling {
//
// public static void main(String[] args) {
//
// String txtFileName = "C:/My/P/Study/CoreJava/C2ImportCalEventSample.csv";
// List<String> list = new ArrayList<>();
//
// // reading csv file into stream, try-with-resources
// try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {
//
// // 1 filtered flight numbers BA-731 and VA-421
// // 2. then only map filtered result to there airport names only
// // 3. store result into a List
// list = stream.filter(line -> line.contains("814-555-5179")).map(line -> {
// String[] str = line.split(",");
// return str[2];
// }).collect(Collectors.toList());
//
// // 4. print result list
// list.forEach(System.out::println);
//
// } catch (IOException ioe) {
// ioe.printStackTrace();
// }
//
// }
//
// }

// =================

// public class O00020_Filehandling {
//
// public static void main(String[] args) {
// PDDocument pd;
// BufferedWriter wr;
// try {
// File input = new File("C://My//P//Study//CoreJava//Sample_CV.pdf"); // The
// PDF file from where you would
// // like to extract
// File output = new File("C://My//P//Study//CoreJava//SampleText.txt"); // The
// text file where you are going
// // to store the extracted
// // data
// pd = PDDocument.load(input);
// System.out.println(pd.getNumberOfPages());
// System.out.println(pd.isEncrypted());
// pd.save("CopyOfInvoice.pdf"); // Creates a copy called "CopyOfInvoice.pdf"
// PDFTextStripper stripper = new PDFTextStripper();
// wr = new BufferedWriter(new OutputStreamWriter(new
// FileOutputStream(output)));
// stripper.writeText(pd, wr);
// if (pd != null) {
// pd.close();
// }
// // I use close() to flush the stream.
// wr.close();
// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }