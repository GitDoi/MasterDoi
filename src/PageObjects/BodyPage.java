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
	
	//List of car body types
	@FindBy(how = How.CLASS_NAME, using = "InventoryCard___3-mn7")
	public List<WebElement> bodyList;
}
