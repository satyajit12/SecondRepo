package Testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToActitime {
	WebDriver driver;
@BeforeMethod
	public void initializebrowser(){
		
		System.setProperty("webdriver.ie.driver", "C://Users//Satyajit//Desktop//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://user-vaio/login.do");
	}	
	@Test
	
	public void login(){
	
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://user-vaio/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	System.out.println("login is done");
		//driver.close();
	}
	@Test
	public void login1(){
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\USER\\Desktop\\IDe server\\IEDriverServer.exe\\");
		//WebDriver driver = new InternetExplorerDriver();
		//driver.get("http://user-vaio/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[contains(@value,'Login now')]")).click();
		//driver.findElement(By.xpath("//a[@href='/project/customers_projects.do']")).click();;
		//driver.findElement(By.xpath("//a[@class='sub_menu_link' & @href='/project/customers_projects.do']")).click();
		//driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		System.out.println("navigate to project and customer");
		//driver.close();
		
		
	}
	//@AfterMethod
	//public void close(){
	   // driver.close();
	//}

}
