package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import PageObjects.HomePage;

public class AutoGravity extends BaseTest
{
  @Test
  public void reachCreditCardApplication() throws InterruptedException 
  {
	  String zip = "92843";
	  
	  HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	  
	  //Choose to Shop New
	  homePage.shopNewButton.click();
	  
	  //Enter zip code and submit.
	  wait.until(ExpectedConditions.visibilityOf(homePage.locationPopUp));
	  homePage.zipTextBox.sendKeys(zip);
	  if (homePage.findButton.isEnabled())
		  homePage.findButton.click();
	  
	  
	  Thread.sleep(5);
  }
}


