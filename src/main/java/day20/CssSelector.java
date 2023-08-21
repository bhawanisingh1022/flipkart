package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
	public static void main(String args[]) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	Thread.sleep(5000);
		//1.tag and id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Apple MacBook Pro 13-inch");
		
         //2.tag & class
	//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("jyoti");
	
	//3.tag & attribute
	//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("parth");
	
	//4.tag class attribute
	driver.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("bhawni");
	
		
	}

}
