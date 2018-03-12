package Testngpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Codeforwritebacktoexcelsheet {
	@Test
	
		public void createcustomer() throws InvalidFormatException, IOException{
		FileInputStream fis =new FileInputStream("C:\\Users\\USER\\Desktop\\satyajit1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("data");
		Row row = sh.getRow(1);
		Cell cel = row.createCell(4);
		cel.setCellType(cel.CELL_TYPE_STRING);
		cel.setCellValue("bubun");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\USER\\Desktop\\satyajit1.xlsx");
		wb.write(fos);
		
		
		
	}

}
