package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	
public CharterPage clickOnCloseMenu(){
		
		clickByXpath(prop.getProperty("CharterPage.CloseMenu.Xpath"));
		return this;
	}
	
	
	public CharterPage clickOnEnquiryForm(){
		
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.Xpath"));
		return this;
	}
	
	
	public CharterPage enterApplicantName(String data) {
		enterByXpath(prop.getProperty("CharterPage.ApplicantName.Xpath"), data);
		return this;
	}
	
	
	public CharterPage enterOrganisationName(String data) {
		enterByXpath(prop.getProperty("CharterPage.OrganisationName.Xpath"), data);
		return this;
	}
	
	public CharterPage enterAddress(String data) {
		enterByXpath(prop.getProperty("CharterPage.Address.Xpath"), data);
		return this;
	}
	

	public CharterPage enterMobile(String data) {
		enterByXpath(prop.getProperty("CharterPage.Mobile.Xpath"), data);
		return this;
	}
	

	public CharterPage enterEmail(String data) {
		enterByXpath(prop.getProperty("CharterPage.Email.Xpath"), data);
		return this;
	}
	
	public CharterPage selectRequestFor(String value) {
		selectVisibleTextByXpath(prop.getProperty("CharterPage.Request.Xpath"), value);
		return this;
	}
	
	
	public CharterPage enterOriginating(String data) {
		enterByXpath(prop.getProperty("CharterPage.Originating.Xpath"), data);
		return this;
	}
	
	public CharterPage enterDestination(String data) {
		enterByXpath(prop.getProperty("CharterPage.Destination.Xpath"), data);
		return this;
	}
	
	
	public CharterPage clickOnDateOfDeparture() {
		
		clickByXpath(prop.getProperty("CharterPage.Departure.Xpath"));
		
		return this;
	}
	
	
	public CharterPage selectDateOfDeparture(String value) {
		clickByXpath(prop.getProperty("CharterPage.DateOfDeparture.Xpath"), value);
		//clickByXpath(prop.getProperty("CharterPage.DateOfDeparture.Xpath"));
		
		return this;
	}
	
	public CharterPage clickOnDateOfArrival(String value) {
		clickByXpath(prop.getProperty("CharterPage.Arrival.Xpath"));
		clickByXpath("(//span[text()='$value$'])[2]");
		return this;
	}
	
	/*public CharterPage selectDateOfArrival(String value) {
		
		clickByXpath(prop.getProperty("CharterPage.DateOfArrival.Xpath"), value);
		clickByXpath("//span[text()="+value+"]");
		//clickByXpath(prop.getProperty("CharterPage.DateOfArrival.Xpath"));
		
		return this;
	}*/
	
	
	
	public CharterPage enterDurationPeriod(String data) {
		enterByXpath(prop.getProperty("CharterPage.Duration.Xpath"), data);
		return this;
	}
	
	public CharterPage enterNumberAndTypeCoaches(String data) {
		enterByXpath(prop.getProperty("CharterPage.TypeCoaches.Xpath"), data);
		return this;
	}
	
	public CharterPage enterNumberOfPassengers(String data) {
		enterByXpath(prop.getProperty("CharterPage.NumberOfPassengers.Xpath"), data);
		return this;
	}
	
	

	public CharterPage enterPurposeOfCharter(String data) {
		enterByXpath(prop.getProperty("CharterPage.Purpose.Xpath"), data);
		return this;
	}
	
	
	public CharterPage enterAdditionalSerivices(String data) {
		enterByXpath(prop.getProperty("CharterPage.Services.Xpath"), data);
		return this;
	}
	
	public CharterPage clickOnSubmit() {
		clickByXpath(prop.getProperty("CharterPage.Sumbit.Xpath"));
		return this;
	}
	
	public CharterPage verifyMobileNumber(String text) {
		verifyTextContainsByXpath(prop.getProperty("CharterPage.MobileNumber.Xpath"), text);
		
		return this;
	}
	
	
	
}
