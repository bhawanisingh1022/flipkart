package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {
public static void main(String args[])
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	String month="January";
	String year="2024";
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
	while(true)
	{
		String mnth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		String yr = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		if(month.equals(mnth)&&year.equals(yr))
		{
			break;
		}
		
		driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
	}
	String Date = "15";
          List<WebElement> date = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
         for(int i=0;i<=35;i++)
         {
        	 if(date.get(i).getText().equals(Date))
        	 {
        		 date.get(i).click();
        	 }
         }
	
	
}
}
