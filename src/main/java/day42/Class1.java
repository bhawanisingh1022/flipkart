package day42;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeTest
	void bt()
	{
		System.out.println("this is before test");
	}
	@BeforeSuite
	void bs()
	{
		System.out.println("this is before suite");
	}
	@Test
	void tm()
	{
		System.out.println("this is first test methood");
	}
	
	
	
	
	
	
	
}
