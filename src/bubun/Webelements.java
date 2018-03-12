package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelements {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://user-vaio/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
//navigate to a link	
//driver.findElement(By.linkText("Completed Tasks")).click();


	}

}
