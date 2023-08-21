package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker_2 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"dob\"]")).click();
		WebElement abc = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
		
		abc.click();
		Select xyz=new Select(abc);
		xyz.selectByValue("6");
		
		WebElement mno = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		
		mno.click();
		Select pqr=new Select(mno);
		pqr.selectByVisibleText("1997");
		String expdate = "10";
	 List<WebElement> date = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		System.out.println(date.size());
		for(int i=0;i<=date.size();i++)
		{
			if(date.get(i).getText().equals(expdate))
			{
				date.get(i).click();
			}
		}
		
	
		
		
		
	}

}
