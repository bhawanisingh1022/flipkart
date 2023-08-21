package day42;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	void tm2()
	{
		System.out.println("this is second test methood");
	}
	@AfterTest
	void at()
	{
		System.out.println("this is after test");
	}

}
