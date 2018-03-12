package bubun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		String s1 = "satyajit";

		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[0] = Character.toUpperCase(ch[0]);
			
			
			if (i < ch.length-1) {
				continue;
			}
			ch[ch.length-1] = Character.toUpperCase(ch[ch.length-1]);
		}
		for (int i = 0; i < ch.length; i++) {

		
		//System.out.print(ch[i]);
		
		s1 = new String(ch);
		}
		System.out.print("Result Is: " + s1);
	}

}
