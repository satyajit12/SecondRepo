package bubun;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		//how to handel alert popup
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.xpath("//a[text()='Hotels and Lounge']")).click();
		Set <String> set=driver.getWindowHandles();
		System.out.println(set.size());
		Iterator<String> it = set.iterator();
		String parentwinid =it.next();
		String childwinid = it.next();
		driver.switchTo().window(childwinid);
		//driver.findElement(By.xpath("//input[@id='textfield']")).sendKeys("love");
		//driver.close();
		//driver.switchTo().window(parentwinidwinid);
		//driver.findElement(By.xpath("//input[@id='usernameId']")).sendKeys("rahul");
		//driver.close();
		String expectedmsg = "Please Enter The City Name.";
		driver.findElement(By.name("submit")).click();
		Alert alt = driver.switchTo().alert();
		String actmsg = alt.getText();
		System.out.println(alt.getText());
		Thread.sleep(4000);
		alt.dismiss();
		if(expectedmsg.equals(actmsg))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	

		
		
		
		


	}


