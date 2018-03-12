package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardoperation {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//login to actitime
		driver.get("http://user-vaio/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//creation of action class
Actions act = new Actions(driver);
//how to give input from keyboard "enter"
act.sendKeys(Keys.RETURN).perform();
	}

}
