package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void cleanUp()
	{
		driver.quit();
	}
	
	public void click()
	{
		
	}
}
