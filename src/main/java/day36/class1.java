package day36;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class1 
{
    @BeforeMethod
	void m1()
	{
		System.out.println("before method");
	}
    @Test(priority=1)
	void m2()
	{
		System.out.println("this is first");
	}
	@AfterMethod
	void m3()
	{
		System.out.println("after method");
	}
	@Test(priority=2)
	void m4()
	{
		System.out.println("this is second");
	}
	@Test(priority=3)
	void m5()
	{
		System.out.println("this is third");
	}
	
	
	
	
}
 
