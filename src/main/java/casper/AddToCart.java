package casper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://casper.com/mattresses");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Mattresses")).click();
		
		WebElement xyz = driver.findElement(By.cssSelector(".mattress-link[href='/mattresses/original-hybrid-v1.html']"));
		
		xyz.click();
		WebElement mno = driver.findElement(By.xpath("//select[@class='custom-select form-control select-size']"));
		Select abc=new Select(mno);
		abc.selectByVisibleText( "Twin XL");
		Thread.sleep(4000);
	 WebElement addtocart = driver.findElement(By.xpath("button[class='ready add-to-cart btn btn-primary ']"));
		
		addtocart.click();
		
		
		
		
		
	}

}
