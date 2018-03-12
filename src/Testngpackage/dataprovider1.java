package Testngpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1 {
	String filepath = "C:\\Users\\USER\\Desktop\\Satyajit.xlsx";
	dataprovider1 elib = new dataprovider1();
	
	public int GetRowCount(String Sheetname) throws InvalidFormatException, IOException{
		   FileInputStream fis = new FileInputStream(filepath);
		   Workbook wb = WorkbookFactory.create(fis);
		   Sheet sh = wb.getSheet(Sheetname);
		   int rowcount = sh.getLastRowNum()+1;
		   return rowcount;
	}
	
	
	public String getExcelRowdata (String sheetname,int rownum,int colnum) throws InvalidFormatException, IOException
	{
	FileInputStream fis = new FileInputStream(filepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	Row row = sh.getRow(rownum);
	String data = row.getCell(colnum).getStringCellValue();
	return data;
	}
	
	
	
	
	@Test(dataProvider = "CreateAccGetdata")
	public void creatAcc(String acc, String pass){
		System.out.println( acc);
		System.out.println( pass);
	}
	
	
	@DataProvider
	public Object[][] CreateAccGetdata() throws InvalidFormatException, IOException{
		int rowcount = elib.GetRowCount("data");
		System.out.println(rowcount);
		Object[][] objarr = new Object[rowcount][2];
		for(int i=0;i<rowcount;i++){
			objarr[i][0]=elib.getExcelRowdata("data", i, 0);
			objarr[i][1]= elib.getExcelRowdata("data", i, 1);
		
			
		}
		return objarr;
		
		
	}
}



	

