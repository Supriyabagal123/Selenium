package dataDrivenFramwork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//generalized the row count
		FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb2.getSheet("IPL");
		int rc= sheet2.getLastRowNum(); // get last row of the sheet
	
		// read multiple data by using for loop
		for (int i=0; i<=rc; i++) {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis); // make the file ready for read
		Sheet sheet = wb.getSheet("IPL"); // get into sheet
		Row row = sheet.getRow(i); //get into desired row
		Cell cell = row.getCell(0); //get the value from cell/column
		String data = cell.getStringCellValue();
		System.out.println(data);
		}
	}
}
