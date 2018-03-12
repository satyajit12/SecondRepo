package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailapps {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&ss=1&ltmpl=default&rm=false");
	//to know the image is present or not.
boolean img= driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
System.out.println("img");
	//use of getattribute()
 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("biharisatyajit@gmail.com");
 System.out.println(driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("value"));
//use of isSelected();
 driver.findElement(By.id("PersistentCookie")).click();
System.out.println(driver.findElement(By.id("PersistentCookie")).isSelected());
	}

}
