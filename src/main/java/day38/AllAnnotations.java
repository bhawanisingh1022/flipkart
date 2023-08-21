package day38;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations 
{
	@BeforeSuite
	void A1()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	void A2()
	{
		System.out.println("before test");
	}
	@BeforeClass
	void A3()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	void A4()
	{
		
		System.out.println("before method");
	}
	@AfterSuite
	void A5()
	{
		System.out.println("after suite");
	}
	@AfterTest
	void A6()
	{
		System.out.println("after test");
	}
	@AfterClass
	void A7()
	{
		System.out.println("after class ");
	}
	@AfterMethod
	void A8()
	{
		System.out.println("after method");
	}
	@Test(priority=1)
	void A9()
	{
		System.out.println("jyoti");
	}
	@Test(priority=2)
	void A10()
	{
		System.out.println("bhawani");
	}

}
