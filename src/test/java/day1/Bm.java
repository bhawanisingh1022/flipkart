package day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bm 
{
	@BeforeMethod
	void bm()
	{
		System.out.println("this is before methood");
	}
	@Test
	void tm1()
	{
		System.out.println("test methood1");
	}
	@Test
	void tm2()
	{
		System.out.println("test methood 2");
	}
	@Test
	void tm3()
	{
		System.out.println("test methood 3");
	}
	@AfterMethod
	void am()
	{
		System.out.println("this is after methood");
	}


}
