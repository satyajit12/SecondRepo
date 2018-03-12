package bubun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Framehandling {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
//navigate to timesjob[
driver.get("http://timesofindia.indiatimes.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.manage().window().maximize();
//explicit wait
WebDriverWait wait = new WebDriverWait(driver, 25);
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='SHOP']")));
//how to handel a frame
driver.findElement(By.xpath("//a[text()='SHOP']")).click();

//driver.findElement(By.xpath("//a[text()='SHOP']")).getText();

driver.switchTo().frame("riShop");
//driver.switchTo().frame("timespointframe");
WebDriverWait wait1 = new WebDriverWait(driver, 40);
wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Midnight Deal - Every Day Get New Deal']")));
driver.findElement(By.xpath("//a[text()='Midnight Deal - Every Day Get New Deal']")).click();
driver.switchTo().defaultContent();
	}

}
