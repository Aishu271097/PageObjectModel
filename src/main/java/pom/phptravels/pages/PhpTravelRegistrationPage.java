package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class PhpTravelRegistrationPage extends GenericWrappers{

	public PhpTravelRegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.FirstName.xpath"), data);
		return this;
	}
	
	public PhpTravelRegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.LastName.xpath"), data);
		return this;
	}

	
	public PhpTravelRegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.Email.xpath"), data);
		return this;
	}
	
	
	
	public PhpTravelRegistrationPage clickOnDialCode() {
		clickByXpath(prop.getProperty("PhpTravelRegistrationPage.DialCode.xpath"));
		return this;
	}
	public PhpTravelRegistrationPage selectDialCode() {	
		clickByXpath(prop.getProperty("PhpTravelRegistrationPage.Dial.xpath"));
		return this;
	}
	
	public PhpTravelRegistrationPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.PhoneNumber.xpath"), data);
		return this;
	}
	
	public PhpTravelRegistrationPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.CompanyName.xpath"), data);
		waitProperty(3000);
		return this;
	}
	
	
	public PhpTravelRegistrationPage enterStreetAddress(String data) {
		//clickByXpath("//input[@name='address1']");
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.Streetaddress.xpath"), data);
		return this;
	}
	
	public PhpTravelRegistrationPage enterStreetAddress2(String data) {
		
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.StreetAddress2.xpath"), data);
		return this;
	}
	
	public PhpTravelRegistrationPage enterCity(String data) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.City.xpath"), data);
		return this;
	}
	
	
	public PhpTravelRegistrationPage enterState(String data) {
		selectVisibleTextByXpath(prop.getProperty("PhpTravelRegistrationPage.State.xpath"), data);
		//enterByXpath(prop.getProperty("PhpTravelRegistrationPage.State.xpath"), data);
		return this;
	}
	
	
	
	public PhpTravelRegistrationPage enterPostCode(String data) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.PostCode.xpath"), data);
		return this;
	}
	
	public PhpTravelRegistrationPage selectCountry(String value) {
		//selectVisibleTextByXpath(prop.getProperty("PhpTravelRegistrationPage.Country.xpath"), value);
		clickByXpath(prop.getProperty("PhpTravelRegistrationPage.Country.xpath"));
		selectValueByXpath(prop.getProperty("PhpTravelRegistrationPage.Country.xpath"), value);
		return this;
	}
	
	public PhpTravelRegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.Mobile.xpath"), data);
		return this;
	}
	
	
	
	public PhpTravelRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.Password.xpath"), data);
		return this;
	}
	

	public PhpTravelRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.ConfirmPassword.xpath"), data);
		return this;
	}
	
	
	
	
}
