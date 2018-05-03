package Tests;

import java.util.Random;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public String baseURL = "Https://www.autogravity.com";
	
	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		wait = new WebDriverWait(driver, 5);
	}
	
	@AfterClass
	public void cleanUp()
	{
		driver.quit();
	}
	
	public int generateRandomInteger(int min, int max)
	{
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
		return r.nextInt((max - min) + 1) + min;
	}
	
	public boolean isElementPresent(WebDriver driver, WebElement element, int seconds)
    {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
        try
        {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}

