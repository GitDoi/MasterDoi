package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReviewLoanPage 
{
	WebDriver driver;
	
	public ReviewLoanPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Next button
	@FindBy(how = How.CSS, using = "button.newButton___3mgiP.btn.btn-primary")
	public WebElement nextButton;
}
