package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[text()='Javadoc']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Capabilities']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='AbstractWebDriverEventListener']")).click();

	}

}
