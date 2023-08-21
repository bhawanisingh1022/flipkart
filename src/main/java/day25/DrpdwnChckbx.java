package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpdwnChckbx {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		List<WebElement> cb=driver.findElements(By.xpath("//input[@class='cb1-element' and @type='checkbox']"));
	/*for(WebElement bc:cb)
		{
			bc.click();
		}*/
		
		for(int i=0;i<4;i++)
		{
			cb.get(i).click();
		}
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='check1']")).click();
		
		
	}

}
