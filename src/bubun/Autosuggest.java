package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("gbqfq")).sendKeys("congnizent carrers",Keys.RETURN);

	}

}
