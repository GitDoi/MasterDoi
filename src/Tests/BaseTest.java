package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest 
{
	public WebDriver driver;
	
	public void click()
	{
		
	}
	
	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("Https://www.autogravity.com");
	}
	
	@AfterClass
	public void cleanUp()
	{
		driver.quit();
	}
}
