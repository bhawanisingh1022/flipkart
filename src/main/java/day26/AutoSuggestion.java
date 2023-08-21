package day26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		WebElement abc = driver.findElement(By.xpath("//textarea[@id='sb_form_q']"));
		Thread.sleep(5000);
		abc.sendKeys("java");
		List<WebElement> xyz = driver.findElements(By.xpath("//span[@class=\'sa_tm_text\']"));
		System.out.println(xyz.size());
		for(int i=0;i<xyz.size();i++)
		{
            
			String mno = xyz.get(i).getText();
			if(mno.equals("java download"))
			{
				xyz.get(i).click();
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
