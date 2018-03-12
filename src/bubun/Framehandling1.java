package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Framehandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://timesofindia.indiatimes.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='horo_footer']")));
		//driver.switchTo().frame("horoscopeframe");
		driver.switchTo().frame("horo_footer");
		driver.findElement(By.xpath("//a[text()='Will you meet your better half in 2015?']")).click();
		driver.switchTo().defaultContent();

	}

}
