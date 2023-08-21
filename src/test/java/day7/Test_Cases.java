package day7;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Cases 
{
	@Test(priority=1)
	void tm1()
	{
		Assert.assertEquals(false, false);
	}
	@Test(priority=2)
	void tm2()
	{
		Assert.assertNotEquals("bhawani", "bhawani");
	}
	@Test(priority=3,dependsOnMethods= {"tm2"})
	void tm3()
	{
		Assert.assertEquals(12, 12);
	}

}
