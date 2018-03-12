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

public class ExcelappsWritebaktoExcel {
	@Test
	public void f1() throws InvalidFormatException, IOException{
FileInputStream fis = new FileInputStream("C:\\Users\\USER\\Desktop\\satyajit.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet("data");
Row rw = sh.getRow(3);
Cell cel = rw.createCell(5);
cel.setCellType(cel.CELL_TYPE_STRING);
cel.setCellValue("bubun");
FileOutputStream f0s = new FileOutputStream("C:\\Users\\USER\\Desktop\\satyajit.xlsx");
wb.write(f0s);

	}
}
