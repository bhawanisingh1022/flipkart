package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableDemo {
	public static void main(String args[])
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"countries\"]//tr"));
		int totalrows = rows.size();
		System.out.println("totalrows:"+  totalrows);
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id=\"countries\"]//h3"));
		int total_cols = cols.size();
		System.out.println("total_cols:"+  total_cols);
		
		String value = driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[4]//td[2]")).getText();
		
		System.out.println(value);
		
		for(int r=1;r<=totalrows;r++)
		{
			
				String xyz = driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]")).getText();
				System.out.print(xyz+"\t");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
