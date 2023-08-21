package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sliders {
public static void main(String args[])
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	WebElement min = driver.findElement(By.xpath("//span[1]"));
	System.out.println("location of element "+min.getLocation());
	
	Actions act=new Actions(driver);
	//act.dragAndDropBy(min, 150, 249).build().perform();
	System.out.println("after moving"+min.getLocation());
	
	WebElement max = driver.findElement(By.xpath("//span[2]"));
	
	System.out.println("malocation"+max.getLocation());
act.dragAndDropBy(max, -150, 249).perform();	
	
	
	
	
	
	
	
	
	
	
	
	
}


















}
