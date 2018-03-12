package bubun;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailAutoit {
@Test
public void xyz() throws InterruptedException, IOException{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='Email']")).clear();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("biharisatyajit@gmail.com");
	driver.findElement(By.id("next")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("Passwd")).clear();
	driver.findElement(By.name("Passwd")).sendKeys("7899265934");
	driver.findElement(By.id("signIn")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
	//Set<String> set = driver.getWindowHandles();
	//System.out.println(set.size());
	Thread.sleep(5000);
	driver.findElement(By.xpath("//tr[td[div[div[text()='Send']]]]/td[4]/div/div[1]/div/div/div")).click();
	Thread.sleep(2000);
    Runtime.getRuntime().exec("C:\\Users\\USER\\Desktop\\AutoIt.exe\\Gmail_autoit.exe");
    Thread.sleep(5000);
   // driver.quit();
}
}
