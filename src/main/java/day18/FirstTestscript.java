package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestscript {
	public static void main (String []args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement abc=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		abc.click();
		Thread.sleep(5000);
		String act_dp="";
		try
		{
		act_dp=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(NoSuchElementException e)
		{
			
		}
		String exp_dp="Dashboard";
		if(act_dp.equals(exp_dp))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}
		

}
