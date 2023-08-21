package day2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Tst2 
{
	@AfterSuite
	void as()
	{
		System.out.println("after suite");
	}
	@AfterTest
	void at()
	{
		System.out.println("After Test");
	}
	@Test
	void t4()
	{
		System.out.println("t4");
	}
	@Test
	void t5()
	{
		System.out.println("t5");
	}
	@Test
	void t6()
	{
		System.out.println("t6");
	}

}
