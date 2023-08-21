package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialndParallel 
{
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		if(br.equals("chrome"))
		{	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
		else if(br.equals("edge"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		}
	
	@Test
	void testlogo()
	{
		boolean status = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	@Test
	void title()
	{
		String tl = driver.getTitle();
		Assert.assertEquals(tl, "Facebook – log in or sign up");
	}
	@AfterClass
	void close()
	{
		driver.quit();
	}

}
