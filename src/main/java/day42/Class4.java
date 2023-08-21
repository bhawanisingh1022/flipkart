package day42;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Class4 {
	@Test
	void tm4()
	{
		System.out.println("this is fourth test methood");
	}
	@AfterSuite
	void s()
	{
		System.out.println("this is after suit");
	}

}
