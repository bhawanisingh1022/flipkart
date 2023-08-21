package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb 
{
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@Test(priority=1)
	void testlogo()
	{
		boolean logo=driver.findElement(By.xpath("//img[@class=\"_97vu img\"]")).isDisplayed();
		Assert.assertEquals(logo, true);
	}
	@Test(priority=2)
	void testlogin() throws InterruptedException
	{
		driver.findElement(By.name("email")).sendKeys("bhawanisingh1022@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("@1nothing");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(true, false);
	}
	@Test(priority=3,dependsOnMethods=("testlogin"))
	void testlogout()
	{
	   Assert.assertTrue(true);
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	
	
	
	

}
