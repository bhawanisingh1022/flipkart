package day35;

import org.testng.annotations.Test;

public class testng 
{
	@Test(priority=3)
	void xyz() 
	{
		System.out.println("jyoti");
		
	}
	@Test(priority=1)
	void abc()
	{
		System.out.println("parth");
	}
	@Test(priority=2)
	void pqr()
	{
		System.out.println("bhawani");
	}
  
}
