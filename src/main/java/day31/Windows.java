package day31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
	public static void main(String args[])
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.com/");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
