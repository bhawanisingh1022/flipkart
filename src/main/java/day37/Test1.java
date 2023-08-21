package day37;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 
{
	@BeforeTest
	void abc()
	{
		System.out.println("this is before test");
	}
	@Test(priority=1)
	void cde()
	{
		System.out.println("2");
	}
	@Test(priority=2)
	void fgh()
	{
		System.out.println("3");
	}
	@Test(priority=3)
	void ijk()
	{
		System.out.println("4");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
