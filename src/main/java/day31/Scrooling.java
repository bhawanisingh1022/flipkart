package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrooling {
	public static void main (String args[])
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=driver;
		WebElement flag = driver.findElement(By.xpath("//td[normalize-space()=\"India\"]"));
		//js.executeScript("arguments[0].scrollIntoView();", flag);
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		js.executeScript("window.scrollBy(0,7457.33349609375)","");
		
		
		
		
	}

}
