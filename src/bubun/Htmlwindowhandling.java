package bubun;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Htmlwindowhandling {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//login to irctc
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//clicking to hotels
		driver.findElement(By.xpath("//a[text()='Hotels and Lounge']")).click();
		//how to handel another window
		//take the window id parent and child window
		Set <String> set=driver.getWindowHandles();
		
		System.out.println(set.size());
		Iterator<String> it = set.iterator();
		String parentwinidwinid =it.next();
		String childwinid = it.next();
		//switch to driver control to child window
		driver.switchTo().window(childwinid);
		driver.findElement(By.xpath("//input[@id='textfield']")).sendKeys("love");
		driver.close();
		//after doing child window operation driver control pass to the parent window
		driver.switchTo().window(parentwinidwinid);
		driver.findElement(By.xpath("//input[@id='usernameId']")).sendKeys("rahul");
		driver.close();
		

	}

}
