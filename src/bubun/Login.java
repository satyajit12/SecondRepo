package bubun;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		  WebDriver driver = new FirefoxDriver();
			driver.get("http://user-vaio/login.duhuhjo");	
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Select sel = new Select(driver.findElement(By.className("")));
		
			String expectedcustomer = "bihari567";
			
	Select sel=new Select(driver.findElement(By.name("customerProject.shownCustomer")));
		List<WebElement>list=sel.getOptions();
		
		System.out.println(list.size());
		Boolean flag=false;
		for(int i = 0;i<list.size();i++){
			String actualcustomer = list.get(i).getText();
			if (expectedcustomer.equals(actualcustomer)){
				sel.selectByVisibleText(expectedcustomer);
				flag = true;
				break;
			}
			
			}
		
			if(!flag){
				System.out.println(expectedcustomer +"=not avilabule");
				
		}
	
	}

}
