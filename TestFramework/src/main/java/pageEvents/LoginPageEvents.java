package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.BaseTest;
import utils.ElementFetch;

public class LoginPageEvents {

	public void verifyLoginPageOpenedOrNot() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Verifying that the Login Page Opened or Not");
		Assert.assertTrue(elementFetch.getListWebElement("XPATH",LoginPageElements.loginText).size()>0,"Login Page did not open");
	}
	
	public  void enterEmailId() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Entering the email-Id");
		elementFetch.getWebElement("ID", LoginPageElements.emailAddress).sendKeys("chandangope555.cg@gmail.com");
	}
}
