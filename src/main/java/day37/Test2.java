package day37;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 
{
	@Test(priority=4)
	void lmn()
	{
		System.out.println("5");
	}
	@Test(priority=5)
	void opq()
	{
		System.out.println("6");
	}
	@AfterTest
	void rst()
	{
		System.out.println("this is after test");
	}
	@Test(priority=6)
	void wxy()
	{
		System.out.println("7");
	}
	

}
