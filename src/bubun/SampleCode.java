package bubun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleCode {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
System.out.println("hai");
driver.get("https://www.google.com");
System.out.println(driver.getTitle());
driver.close();
	}

}
