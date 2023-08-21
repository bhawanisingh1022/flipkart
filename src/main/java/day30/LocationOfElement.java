package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationOfElement {
	public static void main(String ars[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		System.out.println("after maximize"+logo.getLocation());
		driver.manage().window().minimize();
		System.out.println("after minimize"+logo.getLocation());
		driver.manage().window().fullscreen();
		System.out.println("after full screen"+logo.getLocation());
		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
		System.out.println("setsize"+logo.getLocation());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
