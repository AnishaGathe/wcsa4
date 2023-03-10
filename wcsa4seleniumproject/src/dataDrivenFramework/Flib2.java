package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//use to store only generic reusable method
public class Flib2 {
public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rowCount);
	Cell cell = row.getCell(cellCount);
	String data = cell.getStringCellValue();
	return data;
	
}
//to get last row count
public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	int rc = sheet.getLastRowNum();
	return rc;
}

//Write Excel Data
public void writeExcelData(String excelpath,String SheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
		Row row = sheet.getRow(rowCount);
		//---------------------------------------------------
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelpath);
		wb.write(fos);
		
		
	
		
}
}


