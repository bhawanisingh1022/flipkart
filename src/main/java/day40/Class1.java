package day40;

import org.testng.annotations.Test;

public class Class1 {
	@Test(priority=1)
	void openapp()
	{
		System.out.println("testing1");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("testing2");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("testing3");
	}
	
	

}
