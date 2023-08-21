package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb 
{
	WebDriver driver;
	@Test(priority=1)
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();	
	}
	@Test(priority=2,dataProvider="dp")
	void testlogin(String email,String pwd)
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}
	@AfterClass
	/*void klose()
	{
		driver.quit();
	}*/
	@DataProvider(name="dp")
	String[][] logindata()
	{
		String dataa[][]= {{"bhawani@1313","1555"},
				          {"vghuiki@fg","455255"},
				          {"htfhyjgugku","444344"},
				          {"htdtyryfuy","fjgk"},
				          {"bhawanisingh1022@gmail.com","@1nothing"}};
				
		                 		return dataa;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
