package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testsigma.com/blog/mouse-hover-in-selenium/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebElement lo = driver.findElement(By.xpath("//li[@class=\"ts-product-menu group px-10 py-5 border-secondary-200 border-b border-solid lg:border-none\"]"));
		
		WebElement mo = driver.findElement(By.xpath("//a[normalize-space()=\"Mobile App Testing\"]"));
		
		
		
		Actions act=new Actions(driver);
		act.moveToElement(lo).moveToElement(mo).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
