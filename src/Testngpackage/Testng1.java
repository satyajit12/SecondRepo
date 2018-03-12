package Testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng1 {
	@BeforeClass
	public void a(){
		System.out.println("chinu");
	}  
  @Test
  public void f() {
	System.out.println("bubun");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://user-vaio/login.do");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	System.out.println("login is done");
	  
  }
  
  
  
  
 @Test
	 public void f1(){
	 System.out.println("miss u");
	
 }
 @AfterClass
 public void b(){
	 System.out.println("vivek");
 }

}










