package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlesFrames {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement frame1 = driver.findElement(By.cssSelector("frame[src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("bhawani");
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.cssSelector("input[name=\"mytext2\"]")).sendKeys("jyoti");
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.cssSelector("input[name=\"mytext3\"]")).sendKeys("parth");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id=\"i5\"]")).click();
		driver.switchTo().defaultContent();
		WebElement frame4=driver.findElement(By.xpath("//frame[@src=\"frame_4.html\"]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name=\"mytext4\"]")).sendKeys("maa & papa");
		
		
	}

}
