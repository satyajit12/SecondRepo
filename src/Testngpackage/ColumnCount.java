package Testngpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ColumnCount {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("C:\\Users\\USER\\Desktop\\bubun.xlsx");
Workbook wb = new WorkbookFactory().create(fis);
Sheet sh = wb.getSheet("data1");
Row rw = sh.getRow(1);
int cellnumber = rw.getLastCellNum();
System.out.println(cellnumber);
String val = rw.getCell(0).getStringCellValue();
String val1 = rw.getCell(1).getStringCellValue();
String val2= rw.getCell(2).getStringCellValue();
String val3 = rw.getCell(3).getStringCellValue();
String val4= rw.getCell(4).getStringCellValue();
String val5= rw.getCell(5).getStringCellValue();

System.out.println(val);
System.out.println(val1);
System.out.println(val2);
System.out.println(val3);
System.out.println(val4);
System.out.println(val5);

	}

}
