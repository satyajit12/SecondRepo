package bubun;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class LoginToActitime {

	public static void main(String[] args) {
		  WebDriver driver = new FirefoxDriver();
		driver.get("http://satyajit-pc/login.do");	
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//img[@alt='Logout']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		//WebElement selwb = driver.findElement(By.xpath("//select[@name='selectedCustomer']"));
		//how to select customer name from drop down
		//Select sel = new Select(selwb);
        //sel.selectByVisibleText("bubun");
		//sel.selectByIndex(1);
	//ssel.selectByValue("55");
		WebElement table = driver.findElement(By.xpath("//table[@cellspacing='1']"));
		List<WebElement> list = table.findElements(By.tagName("tr"));
		System.out.println(list.size());
		for(int row =0;row<list.size();row++){
		List<WebElement> list1 = list.get(row).findElements(By.tagName("td"));
		System.out.println(list1.size());
		for(int col=0;col<list1.size();col++){
			String cellvalue = list1.get(col).getText();
		}
		
		
	}
		
	}

}
