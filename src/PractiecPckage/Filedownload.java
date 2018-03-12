package PractiecPckage;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Filedownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\SATYAJIT\\Desktop\\FireFoxDriver\\geckodriver.exe");
		FirefoxProfile pr = new FirefoxProfile();
		pr.setPreference("browser.download.folderList", 0);
		pr.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		pr.setPreference("browser.download.dir", "C:\\Users\\USER\\Desktop\\");
		WebDriver driver = new FirefoxDriver(pr);
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[@href='http://selenium-release.storage.googleapis.com/3.0/selenium-java-3.0.1.zip']")).click();;
		
		
		
		
	}

}
