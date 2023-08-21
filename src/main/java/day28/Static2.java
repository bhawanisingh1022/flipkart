package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		int rows=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		System.out.println(rows);
		int cols=driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
		System.out.println(cols);
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value);
			}
			System.out.println();
		}

	}

}
