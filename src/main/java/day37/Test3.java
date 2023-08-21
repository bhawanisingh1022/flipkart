package day37;

import org.testng.annotations.Test;

public class Test3 
{
	@Test(priority=7)
	void a1bc()
	{
		System.out.println("8");
	}
	@Test(priority=8)
	void c2de()
	{
		System.out.println("9");
	}
	@Test(priority=9)
	void f3gh()
	{
		System.out.println("10");
	}
	@Test(priority=10)
	void i4jk()
	{
		System.out.println("11");
	}
	

}
