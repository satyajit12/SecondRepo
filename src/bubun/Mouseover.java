package bubun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouseover {
	
	public static void main(String[] args) throws InterruptedException
	{
		 
		WebDriver driver = new FirefoxDriver();
		//login to monster india
		driver.get("http://www.monsterindia.com/");
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		//mouse over action by clicking mouse to career center
		//WebElement xyz=driver.findElement(By.xpath("//a[text()='Career Center']"));
		WebElement xyz = driver.findElement(By.linkText("Career Center"));
		//how to create action class
	Actions act = new Actions(driver);
	act.moveToElement(xyz).perform();
	
	//explicit wait statement
	WebDriverWait wait= new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Resume Center')]")));
	//clicking to resume center
	driver.findElement(By.xpath("//a[contains(text(),'Resume Center')]")).click();;
	
	
	
	//driver.findElement(By.linkText("Resume Center")).click();
	
	
		
	}
	

}

