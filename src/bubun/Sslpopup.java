package bubun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Sslpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxProfile profile = new FirefoxProfile();
profile.setAssumeUntrustedCertificateIssuer(false);
WebDriver driver = new FirefoxDriver(profile);
driver.get("https://www.facebook.com");

	}

}
