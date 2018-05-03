package PageObjects;

import java.util.List;
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
	
	//Shop New button
	@FindBy(how = How.CSS, using = "button.buttonCTA___CyySJ:nth-child(2)")
	public WebElement shopUsedButton;
	
	//location pop-up
	@FindBy(how = How.CLASS_NAME, using = "CardContent___JsslU")
	public WebElement locationPopUp;
	
	//zip text box
	@FindBy(how = How.CLASS_NAME, using = "input___1ohSH")
	public WebElement zipTextBox;
	
	//Find button
	@FindBy(how = How.CSS, using = ".align-self-start > button:nth-child(1)")
	public WebElement findButton;
	
	//Car make pop-up
	@FindBy(how = How.CLASS_NAME, using = "Card___1h4b3 vehicleMakeModalCard___Lvh1d animateIn___1cy18")
	public WebElement makePopUp;
	
	
	//List of car makes
	@FindBy(how = How.CSS, using = "div.CardContent___JsslU.vehicleMakeModalContent___1Hy6O > div > div > div> span")
	public List<WebElement> MakeList;
	
	//List of car models
	@FindBy(how = How.CSS, using = "div.bodyTypeRow___HXQre > div > div > div > div")
	public List<WebElement> ModelList;
	
	
	
}
