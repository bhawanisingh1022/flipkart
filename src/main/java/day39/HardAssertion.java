package day39;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion 
{
	
	@Test
	void asserti()
	{int x=10;
	int y=20;
		
	//	Assert.assertEquals(x, y,"x is not greater then y");
		if(false)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	
	
	
	
}
