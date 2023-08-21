package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptexecutor {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=driver;
		WebElement name = driver.findElement(By.xpath("//input[@id=\"name\"]"));
		js.executeScript("arguments[0].setAttribute('value','bhawani singh')", name);		
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		js.executeScript("arguments[0].setAttribute('value','bhawanisingh1022@gmail.com')", email);
		WebElement phone = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
		js.executeScript("arguments[0].setAttribute('value','9518673745')", phone);
		WebElement address = driver.findElement(By.xpath("//textarea[@id=\"textarea\"]"));
		js.executeScript("arguments[0].setAttribute('value','vill-siha,dist-rewari')", address);
		WebElement male_rd = driver.findElement(By.xpath("//input[@id=\"male\"]"));
		js.executeScript("arguments[0].click()", male_rd);
		WebElement day = driver.findElement(By.xpath("//input[@id=\"tuesday\"]"));
		js.executeScript("arguments[0].click()", day);
		WebElement country = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select ct=new Select(country);
		ct.selectByVisibleText("Germany");
		WebElement colours = driver.findElement(By.xpath("//select[@id=\"colors\"]"));
		Select co=new Select(colours);
		co.selectByValue("yellow");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
