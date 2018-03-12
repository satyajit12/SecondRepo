package Testngpackage;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Rowcount {
@Test
public void createcustomer() throws InvalidFormatException, IOException {
	
	FileInputStream fis = new FileInputStream("C:\\Users\\SATYAJIT\\Desktop\\DemoDataprovider.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("sheet1");

	int rowcount = sh.getLastRowNum()+1;
	System.out.println(rowcount);
	
	Row rw = sh.getRow(1);
	
	String cellvalue = rw.getCell(0).getStringCellValue();
	
	System.out.println(cellvalue);
	

	
	
	
	
	
	
}
}
