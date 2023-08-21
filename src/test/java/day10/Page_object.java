package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_object 
{
	public WebDriver driver;
	
	//constructor
	Page_object(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")WebElement username;

	@FindBy(name="password")WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']")WebElement clk;
	
	//Action method
	public void username() {username.sendKeys("Admin");}
	public void password() {password.sendKeys("admin123");}
	public void CK(){clk.click();}
	

}
