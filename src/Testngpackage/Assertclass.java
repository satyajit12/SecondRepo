package Testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertclass {
	WebDriver driver;
	@BeforeTest
	public void launchbrowser(){
	     driver = new FirefoxDriver();
		driver.get("http://user-vaio/login.do");
	}
	
	
	
	
@Test
public void assertmethod() throws InterruptedException{
	String expectedvalue = "Open Tasks";
	int i = 1,j = 0;
	//WebDriver driver = new FirefoxDriver();
	//driver.get("http://user-vaio/login.do");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	String actual = driver.findElement(By.xpath("//td[contains(text(),'Open Tasks')]")).getText();
	//String actualvalue = actual.getText();
	System.out.println(actual+"2nd");
	Assert.assertEquals(actual, expectedvalue, actual +"page not verified");
	//if assert statement fails then after assert, statement will not executed. Then it will jump to next testcase and it will 
	//execute that testcase.
	Assert.assertEquals(i, j, i+"hahahah");
	
	
}
@Test
public void verifydefaultImg(){
	//WebDriver driver = new FirefoxDriver();
	//driver.get("http://user-vaio/login.do");
	boolean flag = driver.findElement(By.xpath("//img[contains(@src,'default/logo.gif')] ")).isDisplayed();
	//boolean flag1 = flag.isDisplayed();
	Assert.assertTrue(flag, "image is not displayed");
	System.out.println("image is displayed");
}
//@AfterMethod
//public void close(){
	//driver.close();
	
//}


}
