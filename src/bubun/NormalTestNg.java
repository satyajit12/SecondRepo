package bubun;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NormalTestNg {
WebDriver driver;
	@Test
	public void hari(){
		 driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/?_rdr=p");
		driver.manage().window().maximize();
	}
		@AfterMethod
		public void xys() throws InterruptedException{
			Thread.sleep(5000);
			driver.close();
		}
		
}
	

	
