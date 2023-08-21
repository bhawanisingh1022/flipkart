package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAnd_Drop {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement stockholm=driver.findElement(By.xpath("//div[@id=\"box2\"]"));
		WebElement washington = driver.findElement(By.xpath("//div[@id=\"box3\"]"));
		WebElement copenhagen = driver.findElement(By.xpath("//div[@id=\"box4\"]"));
		WebElement seoul = driver.findElement(By.xpath("//div[@id=\"box5\"]"));
		WebElement rome = driver.findElement(By.xpath("//div[@id=\"box6\"]"));
		WebElement madrid = driver.findElement(By.xpath("//div[@id=\"box7\"]"));
		WebElement oslo = driver.findElement(By.xpath("//div[@id=\"box1\"]"));
		WebElement A = driver.findElement(By.xpath("//div[@id=\"box106\"]"));
		WebElement B = driver.findElement(By.xpath("//div[@id=\"box107\"]"));
		WebElement C = driver.findElement(By.xpath("//div[@id=\"box101\"]"));
		WebElement D = driver.findElement(By.xpath("//div[@id=\"box104\"]"));
		WebElement E = driver.findElement(By.xpath("//div[@id=\"box105\"]"));
		WebElement F = driver.findElement(By.xpath("//div[@id=\"box102\"]"));
		WebElement G = driver.findElement(By.xpath("//div[@id=\"box103\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(stockholm, A).perform();
		act.dragAndDrop(washington, B).perform();
		act.dragAndDrop(copenhagen, C).perform();
		act.dragAndDrop(seoul, D).perform();
		act.dragAndDrop(rome, E).perform();
		act.dragAndDrop(madrid, F).perform();
		act.dragAndDrop(oslo, G).perform();
		
		
		
		
		
	}

}
