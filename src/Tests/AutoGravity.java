package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import PageObjects.BodyPage;
import PageObjects.HomePage;
import PageObjects.ReviewCarPage;
import PageObjects.ReviewLoanPage;

public class AutoGravity extends BaseTest
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
	  
	  //Randomly select a make
	  Thread.sleep(3000);
	  index = generateRandomInteger(0, homePage.MakeList.size() - 1);
	  homePage.MakeList.get(index).click();
	  
	  //Randomly select a model
	  Thread.sleep(3000);
	  index = generateRandomInteger(0, homePage.ModelList.size() - 1);
	  homePage.ModelList.get(index).click();
	  
	  //Randomly select a body type
	  Thread.sleep(3000);
	  index = generateRandomInteger(0, bodyPage.bodyList.size() - 1);
	  bodyPage.bodyList.get(index).click();
	  
	  //Proceed next at car review page
	  Thread.sleep(1000);
	  reviewCarPage.nextButton.click();
	  
	  //Proceed next at loan review page
	  Thread.sleep(1000);
	  reviewLoanPage.nextButton.click();
	  
	  //Reach card application page and wait 5 seconds.  
	  Thread.sleep(5000);
	  
	  //Needed to eliminate leave/stay alert after webdriver closes window so test can finish.
	  driver.navigate().refresh();
  }
}


