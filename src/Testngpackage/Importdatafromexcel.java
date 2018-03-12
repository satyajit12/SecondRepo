package Testngpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Importdatafromexcel {
	
	   @Test
	    public void createcustomer() throws InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\Satyajit\\Desktop\\bubun.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		
		int rowcount = sh.getLastRowNum()+1;
		System.out.println(rowcount);
		
		String username = row.getCell(0).getStringCellValue();
		String password = row.getCell(1).getStringCellValue();
		System.out.println(password);
	    System.out.println(username);
		
	}

}
