package grouping;

import org.testng.annotations.Test;

public class Grouping 
{
	/*
	loginByEmail  - sanity & regression
	loginByfacebook - sanity
	loginBytwitter  - sanity

	signupbyemail - sanity & regression
	signupbyfacebook  - regression
	signupbytwitter  - regression

	paymentinrupees - sanity & regression
	paymentindollar - sanity  
	paymentReturnbyBank  - regression
	*/
	@Test(priority=1,groups= {"sanity&regression"})
	void loginbyemail()
	{
		System.out.println("login by email");
	}
	@Test(priority=2,groups= {"sanity"})
	void loginbyfb()
	{
		System.out.println("login by fb");
	}
	@Test(priority=3,groups= {"sanity"})
	void loginbytwitter()
	{
		System.out.println("login by twitter");
	}
	@Test(priority=4,groups= {"sanity&regression"})
	void signupbyemail()
	{
		System.out.println("sign up by email");
	}
	@Test(priority=5,groups= {"regression"})
	void signupbyfb()
	{
		System.out.println("sign up by fb");
	}
	@Test(priority=6,groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("sign up by twitter");
	}
	@Test(priority=7,groups= {"sanity&regression"})
	void paymentinrupess()
	{
		System.out.println("payment in rupess");
	}
	@Test(priority=8,groups= {"sanity"})
	void paymentindollers()
	{
		System.out.println("payment in dollar");
	}
	@Test(priority=9,groups= {"regression"})
	void paymentreturnbybank()
	{
		System.out.println("payment returnby bank");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
