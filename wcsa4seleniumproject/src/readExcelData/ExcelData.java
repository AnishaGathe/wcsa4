package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		//provide excel sheet file path
		Workbook ws = WorkbookFactory.create(fis);
		//make the file for read
		Sheet sheet = ws.getSheet("IPL");
		//take sheet name
		Row row = sheet.getRow(1);
		//get the value of row
		Cell cell = row.getCell(0);
		//get the value of cell
		String data = cell.getStringCellValue();
		System.out.println(data);
	}

}


