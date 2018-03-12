package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vivek {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://user-vaio/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//img[@alt='Logout']")).click();
		

	}

}
