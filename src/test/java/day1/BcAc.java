package day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BcAc 
{
	
	@BeforeClass
	void bc()
	{
		System.out.println("this is before class");
	}
	@Test
	void tm1()
	{
		System.out.println("test methood1");
	}
	@Test
	void tm2()
	{
		System.out.println("test methoo2");
	}
	@Test
	void tm3()
	{
		System.out.println("test methood3");
	}
	@AfterClass
	void ac()
	{
		System.out.println("this is after class");
	}
	

}
