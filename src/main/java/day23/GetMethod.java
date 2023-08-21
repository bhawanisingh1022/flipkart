package day23;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*get(url)
getTitle()
getCurrentURL()
getPageSource()
getWindowHandle()
getwindowHandles()
*/

public class GetMethod {
	public static void main (String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String abc=driver.getTitle();
		System.out.println("tittle of wp"+abc);
		
		String xyz=driver.getCurrentUrl();
		System.out.println("current url of wp"+xyz);
		
		String mno=driver.getWindowHandle();
		System.out.println("window id"+mno);

		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String>love=driver.getWindowHandles();
		for(String jyoti:love)
		{
			System.out.println("windows ids"+love);
		}
		
		driver.quit();
		
	}

}
