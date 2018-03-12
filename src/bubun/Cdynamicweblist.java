package bubun;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Cdynamicweblist {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://user-vaio/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		// driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		// driver.findElement(By.name("name")).sendKeys("kick u");
		// driver.findElement(By.name("description")).sendKeys("Bad boy");
		// driver.findElement(By.name("createCustomerSubmit")).click();
		// driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
		// WebElement selwb =
		// driver.findElement(By.xpath("//select[@name='customerId']"));
		// Select sel = new Select(selwb);
		// sel.selectByVisibleText("kick u");
		// driver.findElement(By.name("name")).sendKeys("hai");
		// driver.findElement(By.name("description")).sendKeys("i miss u");
		// driver.findElement(By.name("createProjectSubmit")).click();

		Thread.sleep(3000);
		String expectedcustomer = "kick u";
		boolean flag = false;
		WebElement dselwb = driver.findElement(By.name("customerProject.shownCustomer"));
		Select sel = new Select(dselwb);
		List<WebElement> lst = sel.getOptions();
		System.out.println("1st elememt in the list "+lst.size());
		// StringBuilder builder = new StringBuilder();
		for (int i = 0; i < lst.size(); i++) {
			String actcust = lst.get(i).getText();
			// builder.append(actcust).append(",");
			if (actcust.equals(expectedcustomer)) {
				System.out.println(expectedcustomer + "= is availabule");
				sel.selectByVisibleText(expectedcustomer);
				flag = true;

				break;

			}

		}

		// if(flag)
		// {
		// System.out.println("Expected customre " + expectedcustomer
		// +"=is availabule");

		// }
		// System.out.println("actcust value:::" +builder.toString());
	}

}
