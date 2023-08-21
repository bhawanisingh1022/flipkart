package day2;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tst
{
	@BeforeSuite
	void bs()
	{
		System.out.println("before suite");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("before test");
	}
	@Test
	void t1()
	{
		System.out.println("t1");
	}
	@Test
	void t2()
	{
		System.out.println("t2");
	}
	@Test
	void t3()
	{
		System.out.println("t3");
	}

}
