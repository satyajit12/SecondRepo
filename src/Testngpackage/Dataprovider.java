package Testngpackage;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	Exceldata elib = new Exceldata();
	
	
	
@Test(dataProvider ="CreateAccGetdata")
public void CreateAccountTest(String username ,String Password,String name,String name1,String xyz,String yza,String abc) throws InterruptedException{
	System.out.println(username);
	System.out.println(Password);
	System.out.println(name);
	System.out.println(name1);
	System.out.println(xyz);
	System.out.println(yza);
	System.out.println(abc);
//	System.out.println(ghf);
	WebDriver driver = new FirefoxDriver();
	driver.get("http://user-vaio/login.do");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@alt='Logout']")).click();
	//Thread.sleep(2000);
	
}

@DataProvider

public Object[][] CreateAccGetdata() throws InvalidFormatException, IOException{
	int rowcount = elib.GetRowCount("data1");
	int cellnumber = elib.GetColCount("data1",rowcount);
	//System.out.println(cellnumber);
	System.out.println(rowcount);
	Object[][] objarr = new Object[rowcount][cellnumber];
	for(int i=0;i<rowcount;i++){
		for(int j=0;j<cellnumber;j++){
		objarr[i][j]=elib.getExcelRowdata("data1", i, j);
		//objarr[i][1]= elib.getExcelRowdata("data", i, 1);
		//objarr[i][2]= elib.getExcelRowdata("data", i, 2);
		//objarr[i][3]= elib.getExcelRowdata("data", i, 3);
		}
		
	}
	
	
	return objarr ;
	
}

	
	
	

}
