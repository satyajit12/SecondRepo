package PractiecPckage;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToFetchDataFromExcell {
	ExcelLib elib = new ExcelLib();
@DataProvider
Object[][] getData() throws InvalidFormatException, IOException{
	int rownum = elib.GetRowCount("data");
	System.out.println(rownum);
	Object[][] objarray = new Object[rownum][2];
	for(int i =0;i<rownum;i++){
		
		objarray[i][0] = elib.GetStringValue(i, "data", 0);
		objarray[i][1] = elib.GetStringValue(i, "data", 1);
	}
	
	return objarray;
	
}

@Test(dataProvider="getData")
public void Test1(String username,String Password){
	System.out.println(username);
	System.out.println(Password);
	WebDriver driver = new FirefoxDriver();
	driver.get("http://user-vaio/login.do");
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@value='Login now']")).click();
	driver.findElement(By.xpath("//img[@alt='Logout']")).click();
	
}


}
