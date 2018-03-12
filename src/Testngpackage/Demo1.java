package Testngpackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {
@BeforeSuite
public void xyz(){
	System.out.println("bihari");
}

@Test
public void yvc(){
	System.out.println("bhabani");
}

@AfterSuite
public void asd(){
	System.out.println("bubun");
}

}
