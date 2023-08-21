package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLess {
	public static void main(String args[])
	{
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.sendKeys("bhawanisingh1022@gmail.com");
		WebElement pswrd = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		pswrd.sendKeys("@1nothing");
		WebElement login = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		login.click();
		WebElement actual = driver.findElement(By.xpath("//span[normalize-space()=\"What's on your mind, Bhawani?\"]"));
		String expected = "What's on your mind, Bhawani?";
		if(actual.getText().equals(expected))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
