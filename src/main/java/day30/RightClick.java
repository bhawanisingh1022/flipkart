package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement rghtclk = driver.findElement(By.xpath("//span[normalize-space()=\"right click me\"]"));
		
		Actions act=new Actions(driver);
		act.contextClick(rghtclk).build().perform();
		WebElement copy = driver.findElement(By.xpath("//span[normalize-space()=\"Copy\"]"));
		copy.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
	}
}
