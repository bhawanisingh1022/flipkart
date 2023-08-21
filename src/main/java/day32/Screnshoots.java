package day32;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screnshoots {
	public static void main(String args[]) throws IOException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/course/learn-selenium-with-java-live-project/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	/*	TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\parth chauhan\\OneDrive\\Desktop\\abc\\seleniumwebdriver\\screnshot\\bhawani.png");
		
		FileUtils.copyFile(src, trg);*/
		WebElement girl = driver.findElement(By.xpath("//div[@class=\"paid-course-landing-page__body\"]"));
		File src = girl.getScreenshotAs(OutputType.FILE);
		
		File trgt=new File("C:\\Users\\parth chauhan\\OneDrive\\Desktop\\abc\\seleniumwebdriver\\screnshot\\lbu.png");
		FileUtils.copyFile(src, trgt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
