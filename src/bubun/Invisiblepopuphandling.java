package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invisiblepopuphandling {

	public static void main(String[] args) {
		    WebDriver driver = new FirefoxDriver();
		    //how to handel invisible popup
		    driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		    //without giving username and password login to irctc
		    driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
		    boolean flag = driver.findElement(By.xpath("//span[text()='Enter User ID']")).isEnabled();
		    if(flag)
		{
			String msg = driver.findElement(By.xpath("//span[text()='Enter User ID']")).getText();
			System.out.println(msg);
			driver.findElement(By.xpath("//span[@class='close']")).click();
			
		}
		else
		{
		    System.out.println("error msg is not displayed");	
		}

	}

}
