package Testngpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Exceldata {
	
		String filepath = "C:\\Users\\USER\\Desktop\\bubun.xlsx";
		//public static void main(String[] args) {
			//String filepath = "C:\\Users\\USER\\Desktop\\Satyajit.xlsx";
	public String getExcelRowdata (String sheetname,int rownum,int colnum) throws InvalidFormatException, IOException
			{
			FileInputStream fis = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			Row row = sh.getRow(rownum);
			String data = row.getCell(colnum).getStringCellValue();
			
			
			return data;
				
			}
	public int GetRowCount(String Sheetname) throws InvalidFormatException, IOException{
		   FileInputStream fis = new FileInputStream(filepath);
		   Workbook wb = WorkbookFactory.create(fis);
		   Sheet sh = wb.getSheet(Sheetname);
		   int rowcount = sh.getLastRowNum()+1;
		   return rowcount;
	}
    public int GetColCount(String Sheetname,int rownumber) throws InvalidFormatException, IOException{
	       FileInputStream fis1 = new FileInputStream(filepath);
	       Workbook wb1 = new WorkbookFactory().create(fis1);
	       Sheet sh1 = wb1.getSheet(Sheetname);
	       Row rw = sh1.getRow(1);
	       int cellnumber = rw.getLastCellNum();
	       System.out.println(cellnumber);
	       return cellnumber;
}

		   
	
	
}
