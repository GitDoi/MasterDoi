package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import PageObjects.BodyPage;
import PageObjects.HomePage;
import PageObjects.ReviewCarPage;
import PageObjects.ReviewLoanPage;

public class AutoGravityTest extends BaseTest
{
  @Test
  public void reachCreditCardApplication() throws InterruptedException 
  {
	  String zip = "92843";
	  int index;

	  //Initialize page objects used
	  HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	  BodyPage bodyPage = PageFactory.initElements(driver, BodyPage.class);
	  ReviewCarPage reviewCarPage = PageFactory.initElements(driver, ReviewCarPage.class);
	  ReviewLoanPage reviewLoanPage = PageFactory.initElements(driver, ReviewLoanPage.class);
	  
	  //Select to shop new car
	  homePage.shopNewButton.click();
	  
	  //Enter zip code and submit.
	  wait.until(ExpectedConditions.visibilityOf(homePage.locationPopUp));
	  homePage.zipTextBox.sendKeys(zip);
	  homePage.findButton.click();
	  Thread.sleep(3000);
	  
	  //Randomly select a make
	  index = generateRandomInteger(0, homePage.MakeList.size() - 1);
	  homePage.MakeList.get(index).click();
	  Thread.sleep(3000);
	  
	  //Randomly select a model
	  index = generateRandomInteger(0, homePage.modelList.size() - 1);
	  homePage.modelList.get(index).click();
	  Thread.sleep(3000);
	  
	  //If necessary, select random year
	  if(isElementPresent(driver, bodyPage.yearTab, 1))
	  {
		  index = generateRandomInteger(0, bodyPage.yearList.size() - 1);
		  bodyPage.yearList.get(index).click();
		  Thread.sleep(3000);
	  }
	  
	  //If necessary, select random trim.
	  if(isElementPresent(driver, bodyPage.trimSection, 1))
	  {
		  index = generateRandomInteger(0, bodyPage.trimList.size() - 1);
		  bodyPage.trimList.get(index).click();
		  Thread.sleep(3000);
	  }
	   
	  //If necessary, select a random body type from filter page
	  if (isElementPresent(driver, bodyPage.bodyTypeSection, 1))
	  {
		  index = generateRandomInteger(0, bodyPage.bodyList.size() - 1);
		  bodyPage.bodyList.get(index).click();
		  Thread.sleep(1000);
	  }
	  
	  //If reached, proceed next at car review page
	  if (isElementPresent(driver, reviewCarPage.nextButton, 1))
	  {
		  reviewCarPage.nextButton.click();
		  Thread.sleep(1000);
	  }
	  
	  //Proceed next at loan review page
	  reviewLoanPage.nextButton.click();
	  Thread.sleep(1000);
	  
	  /*//If necessary, select dealer.
	  if()
	  {
		  index = generateRandomInteger(0, bodyPage.bodyList.size() - 1);
		  Thread.sleep(3000);
	  }*/
	  
	  //Reach card application page and verify.    
	  if (!driver.getPageSource().contains("Personal Information"))
	  {
		  driver.navigate().refresh();
		  Assert.fail("Target page was not reached.");
	  }
	  
	  //Trigger alert and stay on page. 
	  driver.navigate().refresh();
	  driver.switchTo().alert().accept();
  }
}


