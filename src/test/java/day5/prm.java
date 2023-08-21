package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prm 
{
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
void setup(String br)
{
		if(br.equals("chrome"))
		{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
		else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
	@Test(priority=1)
void testlogo()
{
	boolean logo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
	Assert.assertEquals(logo, true);
}
	@Test(priority=2)
void titles()
{
	String title = driver.getTitle();
	Assert.assertEquals(title, "OrangeHRM");
}
	@AfterClass
void close()
{
	driver.quit();
}

}
