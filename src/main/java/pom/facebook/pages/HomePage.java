package pom.facebook.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public SignUpPage clickOnCreateAccount() {
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.xpath"));
		return new SignUpPage();
	}
	
	

}
