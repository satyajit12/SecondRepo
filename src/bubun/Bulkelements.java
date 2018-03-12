package bubun;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bulkelements {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	//login to actitime
    driver.get("http://user-vaio/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	//how to handel bulk of elements
	driver.findElement(By.linkText("Projects & Customers")).click();
	Select sel = new Select(driver.findElement(By.xpath("//select[@name='recordsPerPage']")));
	sel.selectByVisibleText("10");
	//String custxpath = "//tr[th[contains(text(),' Customer / Project')]]/following-sibling::tr/td[6]/input";
	
	//driver.findElement(By.xpath("//tr[th[contains(text(),' Customer / Project')]]/following-sibling::tr/td[6]/input")).click();
	List<WebElement> chlist = driver.findElements(By.xpath("//tr[th[contains(text(),' Customer / Project')]]/following-sibling::tr/td[6]/input"));   
	System.out.println("1st elememt in the list "+chlist.size());
	for(int i=0;i<chlist.size();i++)
	{
		chlist.get(i).click();
	}
	

	}

}
