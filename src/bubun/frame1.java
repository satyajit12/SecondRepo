package bubun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class frame1 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://timesofindia.indiatimes.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.linkText("Dumb And Dumber To")).click();;



driver.switchTo().frame("horoscopeframe");
//Thread.sleep(5000);

WebDriverWait wait = new WebDriverWait(driver, 25);
wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Read More»']")));
driver.findElement(By.xpath("//a[text()='Read More»']")).click();;
WebDriverWait wait1 = new WebDriverWait(driver, 40);
wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Download Astrospeak app now']")));
driver.findElement(By.xpath("//a[text()='Download Astrospeak app now']")).click();
	}

}
 