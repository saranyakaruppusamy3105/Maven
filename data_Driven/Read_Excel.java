package data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\saran\\eclipse-workspace\\Maven_11AM\\DataDriven\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		int pnr = sheetAt.getPhysicalNumberOfRows();
		
		for(int i=0; i<pnr; i++) {
			Row row = sheetAt.getRow(i);
		
		 int pnc = row.getPhysicalNumberOfCells();
		 
		 for (int j = 0; j < pnc; j++) {
			 
			 Cell cell = row.getCell(j);
			
			 if(cell.equals(CellType.STRING)) {
				 String stringCellValue = cell.getStringCellValue();
				 System.out.println(stringCellValue);
				 
			 }
			 else if(cell.equals(CellType.NUMERIC)) {
				 double numericCellValue = cell.getNumericCellValue();
				 System.out.println(numericCellValue);
				 
				 
		}
	    }
		}
	}

}
