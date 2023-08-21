package day36;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 
{
	@BeforeClass
	void a1()
	{
		System.out.println("this is before class");
	}
	@AfterClass
	void b2()
	{
		System.out.println("this is after class");
	}
	@Test
	void c3()
	{
		System.out.println("first method");
	}
	@Test
	void d4()
	{
		System.out.println("second method");
	}
	@Test
	void e5()
	{
		System.out.println("third method");
	}
	@Test
	void f6()
	{
		System.out.println("fourth method");
	}

}
