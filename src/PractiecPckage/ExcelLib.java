package PractiecPckage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {

	public int GetRowCount(String SheetName) throws InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\USER\\Desktop\\Maa.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int rowNum = sh.getLastRowNum()+1;
		return rowNum;
	}
	
	public String GetStringValue(int rowNum,String SheetName,int cellnumber) throws InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\USER\\Desktop\\Maa.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row rw = sh.getRow(rowNum);
		String cellvalue = rw.getCell(cellnumber).getStringCellValue();
		return cellvalue;
		
	}
	
}
