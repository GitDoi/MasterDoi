package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReviewCarPage 
{
	WebDriver driver;
	
	public ReviewCarPage(WebDriver driver)
	{
		this.driver = driver;
	}
		
	//Next button
	@FindBy(how = How.CSS, using = "div.buttonNextContainer___1EySu > button")
	public WebElement nextButton;
}
