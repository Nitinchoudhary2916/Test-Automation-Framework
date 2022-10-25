package pageEvents;

import pageObjects.HomePageElements;
import utils.BaseTest;
import utils.ElementFetch;

public class HomePageEvents {
	
	public void clickOnSignInButton() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking on Sign-In  Button");	
		elementFetch.getWebElement("XPATH",HomePageElements.signInButton).click();
		
		
	}

}
