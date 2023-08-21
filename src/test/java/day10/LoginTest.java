package day10;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	WebDriver driver;
	@BeforeClass
	void stup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@Test
	void login() throws InterruptedException
	{
		Page_object pg=new Page_object(driver);
		pg.username();
		pg.password();
		Thread.sleep(4000);
		pg.CK();
		
	}
	@AfterClass
	void close()
	{
		driver.close();
	}

}
