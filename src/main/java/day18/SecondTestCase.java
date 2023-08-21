package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase {
	public static void main(String[]args) throws InterruptedException
	{
       
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pswrd=driver.findElement(By.name("Password"));
		pswrd.clear();
		pswrd.sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		Thread.sleep(5000);
		String act_title=driver.getTitle();
		String exp_title="Dashboard / nopCommerce administration";
		if(act_title.equals(exp_title))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
