package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage 
{
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Shop New button
	@FindBy(how = How.CSS, using = "button.buttonCTA___CyySJ:nth-child(1)")
	public WebElement shopNewButton;
	
	//location pop-up
	@FindBy(how = How.CLASS_NAME, using = "CardContent___JsslU")
	public WebElement locationPopUp;
	
	@FindBy(how = How.CLASS_NAME, using = "input___1ohSH")
	public WebElement zipTextBox;
	
	@FindBy(how = How.CSS, using = ".align-self-start > button:nth-child(1)")
	public WebElement findButton;
	
	
	
}
