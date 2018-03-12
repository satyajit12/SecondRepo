package Testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeGroups(groups = {"reg","smoke"})
	public void fbv(){
		System.out.println("start");
	}
@Test(groups={"reg"})
public void Login(){
	WebDriver driver = new FirefoxDriver();
	driver.get("http://satyajit-pc/login.do");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
    System.out.println("login is done");
}

@Test(groups={"smoke"})
public void login1(){
	System.out.println("pintu");
}
	
@Test(groups={"reg"})
public void log(){
	System.out.println("xyz");
}
@Test(groups={"smoke"})
public void log1(){
	System.out.println("abc");
}

@AfterGroups(groups={"reg","smoke"})
public void asd(){
	System.out.println("end");
}

	
		
}
