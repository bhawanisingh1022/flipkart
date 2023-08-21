package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blaze_demo {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebElement departure = driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
		Select st=new Select(departure);
		st.selectByVisibleText("Mexico City");
		WebElement destination = driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
		Select st1=new Select(destination);
		st1.selectByValue("Dublin");
		driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
		List<WebElement> flight = driver.findElements(By.xpath("//input[@class=\"btn btn-small\"]"));
		for(int i=0;i<5;i++)
		{
			if(i==3)
			{
				flight.get(i).click();
				break;
			}
		}
		
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//input[@id=\"inputName\"]"));
		name.sendKeys("bhawani singh");
		WebElement adress = driver.findElement(By.xpath("//input[@name=\"address\"]"));
		adress.sendKeys("12345 thanedar ki kothiii");
		WebElement city = driver.findElement(By.xpath("//input[@name=\"city\"]"));
		city.sendKeys("rewari");
		WebElement state = driver.findElement(By.xpath("//input[@name=\"state\"]"));
		state.sendKeys("haryana");
		WebElement zipcode = driver.findElement(By.xpath("//input[@name=\"zipCode\"]"));
		zipcode.sendKeys("123411");
		WebElement CardType = driver.findElement(By.xpath("//select[@name=\"cardType\"]"));
		Select crd=new Select(CardType);
		crd.selectByValue("amex");
		WebElement cardnmbr = driver.findElement(By.xpath("//input[@id=\"creditCardNumber\"]"));
		cardnmbr.sendKeys("4160210604210423");
		WebElement mnth = driver.findElement(By.xpath("//input[@id=\"creditCardMonth\"]"));
		mnth.sendKeys("12");
		WebElement yr = driver.findElement(By.xpath("//input[@id=\"creditCardYear\"]"));
		yr.sendKeys("24");
		WebElement nmcrd = driver.findElement(By.xpath("//input[@id=\"nameOnCard\"]"));
		nmcrd.sendKeys("bhawani rajput");
		driver.findElement(By.xpath("//label[@class=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(5000);
		String actualtext = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
		String expectedtext = "Thank you for your purchase today!";
		if(actualtext.equals(expectedtext))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("failed");
		}
		driver.quit();
		
	}
	

}
