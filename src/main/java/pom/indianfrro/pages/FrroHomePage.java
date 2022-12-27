package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class FrroHomePage extends GenericWrappers{

	public FrroRegistrationPage clickOnSignUp() {
		clickByXpath(prop.getProperty("FrroRegistrationPage.Registration.xpath"));
		return new FrroRegistrationPage();
	}
	
	
	
}
