package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Frame {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.ie.driver","C:\\Users\\Lenovo\\Desktop\\IE Driver\\IEDriverServer.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("//a [text()='com.thoughtworks.selenium']")).click();
			
			//Pass Driver Control To Frame 1
			driver.switchTo().frame("classFrame");
			Thread.sleep(3000);
			driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
			// Pass Driver Control To Parent Window
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			//Pass Driver Control to Frame 2
			driver.switchTo().frame("packageFrame");
			Thread.sleep(3000);
			driver.findElement(By.linkText("Actions")).click();
			Thread.sleep(3000);
			System.out.println("Bhabani Shankar");
			driver.quit();
		}
	}


