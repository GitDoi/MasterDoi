package PageObjects;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BodyPage 
{	
	public WebDriver driver;

	public BodyPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Body type section
	@FindBy(how = How.CSS, using = ".InventoryView___1Xsxd")
	public WebElement bodyTypeSection;
	
	//List of car body types
	@FindBy(how = How.CLASS_NAME, using = "InventoryCard___3-mn7")
	public List<WebElement> bodyList;
	
	//Year tab
	@FindBy(how = How.CSS, using = "div.specialOffers___2pmhn > div.toggle___2hlXQ > div")
	public WebElement yearTab;
	
	//List of car years
	@FindBy(how = How.CSS, using = "div.tabs___1Mh3T.borderless___3529_ button")
	public List<WebElement> yearList;
	
	//Trim section
	@FindBy(how = How.CLASS_NAME, using = "trimList___JZMDR")
	public WebElement trimSection;
	
	//List of car trims
	@FindBy(how = How.CLASS_NAME, using = "TrimListItem___2BANQ")
	public List<WebElement> trimList;
}
