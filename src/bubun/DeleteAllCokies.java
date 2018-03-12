package bubun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteAllCokies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/?_rdr=p");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
System.out.println("vyigiybkj");
	}

}
