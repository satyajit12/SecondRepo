package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Fileattachment1 {

	public static void main(String[] args) {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("browser.download.folderList",1);
	
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
	WebDriver driver = new FirefoxDriver(profile);
	driver.get("http://www.seleniumhq.org/download/");
	driver.findElement(By.xpath("//a[contains(@href,'selenium-java')]")).click();
	profile.setPreference("browser.download.dir", "C:\\Users\\USER\\Desktop\\fnsg\\");
	

	}

}
