package day39;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion 
{
	@Test
	/*void abc()
	{
		int a=20;
		int b=20;
		Assert.assertEquals(a, b);
		System.out.println("jyoti");
		System.out.println("bhawani");
		System.out.println("parth");
	}*/

	void bhg()
	{
	
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(20, 10);
		System.out.println("asha");
		System.out.println("deva");
		sa.assertAll();
		
	}
	
}
