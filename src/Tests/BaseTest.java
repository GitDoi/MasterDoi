package Tests;

import java.util.Random;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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
		//Disable geolocation for firefox
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("geo.enabled", false);
		
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get(baseURL);
		wait = new WebDriverWait(driver, 5);
	}
	
	@AfterClass
	public void cleanUp()
	{
		driver.quit();
	}
	
	//Generates random int between specified range
	public int generateRandomInteger(int min, int max)
	{
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
		return r.nextInt((max - min) + 1) + min;
	}
	
	//Checks for the prescence of a web element
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

