package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement abc=driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select mno=new Select(abc);
		//mno.selectByVisibleText("Iphone");
		//mno.selectByValue("Google");
		//mno.selectByIndex(1);
		List<WebElement> xyz=mno.getOptions();
		System.out.println(xyz.size());
		for(WebElement zxd:xyz)
		{
			System.out.println(zxd.getText());
		}
		//select all
		/*for(int i=0;i<abc.size();i++)
		{
			abc.get(i).click();
		}*/
		
		/*for(WebElement mno:abc)
		{
			mno.click();
		}*/
		
		/*for(int i=0;i<7;i++)
			if(i==4||i==5||i==6)
 
		{
			abc.get(i).click();
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
