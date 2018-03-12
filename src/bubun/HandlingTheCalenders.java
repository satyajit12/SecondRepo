package bubun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTheCalenders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\SATYAJIT\\Desktop\\FireFoxDriver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/flights?gclid=CPvS06-i3dECFcGOaAodgQUEGQ");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//strong[text()='Depart on']")).click();

		/*int count=0;
		while (count>12) {
		   
		try{
		driver.findElement(By.xpath("//td[@data-month='1']/a[text()='21']")).click();
		break;
		}

		catch(Exception e){
		    driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		   
		    count++;
		}
		}*/
		
	for(int i=0;i<12;i++){
		/*boolean cv =false;
		cv = driver.findElement(By.xpath("//td[@data-month='5']/a[text()='21']")).isDisplayed();
		System.out.println(cv);
		if(cv == true){
			driver.findElement(By.xpath("//td[@data-month='5']/a[text()='21']")).click();
			break;
		}
		if(cv == false){
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		}*/
		try{
			driver.findElement(By.xpath("//td[@data-month='5']/a[text()='21']")).click();
			break;
		}
		catch(Exception e){
			//e.getMessage();
			System.out.println(e.getMessage());
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		}
		
	}
		
		
		
		    }
	}


