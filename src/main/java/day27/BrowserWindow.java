package day27;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserWindow {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@class=\"wikipedia-search-input\"]")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
		List<WebElement> te = driver.findElements(By.xpath("//div[@id=\"wikipedia-search-result-link\"]"));
		System.out.println(te.size());
		Set<String> windowids = driver.getWindowHandles();
		List<String>winid=new ArrayList(windowids);
		for(int i=0;i<5;i++)
		{
			if(i==3)
			{
			driver.switchTo().window(winid.get(i));
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@class=\"cdx-text-input__input\"]")).sendKeys("java");
			
			}
			
		}
		
		
		
		
		
	}
			
}
