package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationTable {
public static void main(String args[])
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	
	driver.get("https://demo.opencart.com/admin/index.php");
	WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
	username.clear();
	username.sendKeys("demo");
	WebElement pswrd = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	pswrd.clear();
	pswrd.sendKeys("demo");
	 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	WebElement close = driver.findElement(By.xpath("//button[@class=\"btn-close\"]"));
	if(close.isDisplayed())
	{
		close.click();
	}
	
	driver.findElement(By.xpath("//li[@id=\"menu-customer\"]")).click();
	driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
	
	String total_pages=driver.findElement(By.xpath("//div[@class=\"col-sm-6 text-end\"]")).getText();
	
	int text = Integer.parseInt(total_pages.substring(total_pages.indexOf("(")+1,total_pages.indexOf("Pages")-1));
	
	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
}
}
