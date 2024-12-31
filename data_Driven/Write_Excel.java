package data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	
	public static void main(String[] args) throws IOException {
		
	File f = new File("C:\\Users\\saran\\eclipse-workspace\\Maven_11AM\\DataDriven\\Write_Data.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	
	Sheet sheet = wb.createSheet("Course1");
	
	wb.getSheet("Course").createRow(0).createCell(0).setCellValue("java");
	wb.getSheet("Course").createRow(0).createCell(1).setCellValue("Selenium");
	wb.getSheet("Course").createRow(1).createCell(0).setCellValue("AWS");
	wb.getSheet("Course").createRow(1).createCell(1).setCellValue("SQL");
	wb.getSheet("Course").createRow(2).createCell(0).setCellValue("SAP");
	wb.getSheet("Course").createRow(2).createCell(1).setCellValue("Java Script");
	
	FileOutputStream fos = new FileOutputStream(f);
	
	wb.write(fos);
	
	wb.close();
	





	
	
}
}