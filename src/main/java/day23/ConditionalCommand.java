package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommand {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		boolean Abc=driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(Abc);
		
		boolean xyz=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).isEnabled();
		System.out.println(xyz);
		
		driver.quit();
		
	}

}
