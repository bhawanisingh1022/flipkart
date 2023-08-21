package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Casper {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://casper.com/");
	driver.manage().window().maximize();
	Thread.sleep(7000);
	WebElement abc=driver.findElement(By.xpath("//*[@id=\"mattress-card\"]/div/a"));
	Thread.sleep(5000);
abc.click();

	}

}
