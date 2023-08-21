package day32;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	public static void main(String args[]) throws IOException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int brokenlinks=0;
		 for(WebElement linkele:links)
		 {
			 String hrefatt = linkele.getAttribute("href");
			 if(hrefatt==null||hrefatt.isEmpty())
			 {
				 System.out.println("href attr. is empty");
				 continue;
			 }
			 URL linkurl=new URL(hrefatt);
			 
			 HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection();
			 conn.connect();
			 if(conn.getResponseCode()>=400)
			 {
				 System.out.println(hrefatt+       "this is broken link");
				 brokenlinks++;
			 }
			 else
			 {
				 System.out.println("this is not broken link");
			 }
			 System.out.println("total no of broken link"+brokenlinks);
			 
			 
			 
			 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
