package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DealerPage 
{
	WebDriver driver;
	
	public DealerPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Zip text box
	@FindBy(how = How.CLASS_NAME, using = "input___27f7_")
	public WebElement zipTextBox;
	
	//List of dealers
	@FindBy(how = How.CSS, using = "div.dealerList___3mNfb > div > div.dealerImageContainer___23Wwr")
	public List<WebElement> dealerList;
	
	//List of dealer select buttons
	@FindBy(how = How.CSS, using = "div.hiddenUnlessExpanded___109tT > button")
	public List<WebElement> dealerButtonList;	
}
