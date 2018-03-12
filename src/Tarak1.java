import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Tarak1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Select sel = new Select(driver.findElement(By.id("month")));
		sel.selectByVisibleText("Jan");
		Select sel0 = new Select(driver.findElement(By.id("day")));
		sel.selectByVisibleText("4");
		Select sel1 = new Select(driver.findElement(By.id("year")));
		sel.selectByVisibleText("2014");
		

	}

}
