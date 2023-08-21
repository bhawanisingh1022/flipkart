package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	
	@Test (priority=1)
	void openapp()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@Test(priority=2)
	 void login()
	{
		WebDriver driver = null;
	    driver.findElement(By.id("email")).sendKeys("rajputvinay99@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("@1nothing");
	    driver.findElement(By.name("login")).click();
	}
	@Test (priority=3)
	void klose()
	{
		WebDriver driver = null;
		driver.quit();
	}

}
