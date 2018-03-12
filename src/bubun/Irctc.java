package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAssumeUntrustedCertificateIssuer(false);
WebDriver driver = new FirefoxDriver(profile);
driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
Thread.sleep(5000);
String xy = driver.findElement(By.xpath("//img[@id='cimage']")).getText();
System.out.println("xy");

	}

}
