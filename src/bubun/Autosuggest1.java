package bubun;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggest1 {
public static void main(String[] args){
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.co.in");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.id("gbqfq")).sendKeys("bubun");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
List<WebElement> lst = driver.findElements(By.xpath("//ul[@class='sbsb_b']"));
for(int i=0;i<lst.size();i++){
	
	System.out.println(lst.get(i).getText());
	
	
}
	

	}

}
