import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class addition
{
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&ss=1&ltmpl=default&rm=false");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("biharisatyajit@gmail.com");
	driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("7899265934");
	driver.findElement(By.xpath("//input[@id='signIn']")).click();
}
	

}
