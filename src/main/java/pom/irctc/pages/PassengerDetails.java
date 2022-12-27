package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassengerDetails extends GenericWrappers {

	public PassengerDetails lastWindow() {
		switchToLastWindow();
		return this;
	}
	
	
	
	public PassengerDetails selectTitle(String value) {
		selectVisibleTextByXpath(prop.getProperty("PassengerDetails.Title.xpath"), value);
		return this;
	}
	
	public PassengerDetails enterFirstName(String data) {
		enterByXpath(prop.getProperty("PassengerDetails.FirstName.xpath"), data);
		return this;
	}
	
	public PassengerDetails enterLastName(String data) {
		enterByXpath(prop.getProperty("PassengerDetails.LastName.xpath"), data);
		return this;
	}
	public PassengerDetails selectCountry(String value) {
		selectVisibleTextByXpath(prop.getProperty("PassengerDetails.Country.xpath"), value);
		return this;
	}
	
	public PassengerDetails selectState(String value) {
		selectVisibleTextByXpath(prop.getProperty("PassengerDetails.State.xpath"), value);
		return this;
	}
	
	
	public PassengerDetails enterEmail(String data) {
		enterByXpath(prop.getProperty("PassengerDetails.Email.xpath"), data);
		return this;
	}
	
	
	
	
	public PassengerDetails selectGst(String value) {
		selectVisibleTextByXpath(prop.getProperty("PassengerDetails.Gst.xpath"), value);
		return this;
	}
	
	public PassengerDetails enterGstNumber(String data) {
		enterByXpath(prop.getProperty("PassengerDetails.GstNumber.xpath"), data);
		return this;
	}
	
	public PassengerDetails enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PassengerDetails.CompanyName.xpath"), data);
		return this;
	}
	
	public PassengerDetails enterCompanyAddress(String data) {
		enterByXpath(prop.getProperty("PassengerDetails.CompanyAddress.xpath"), data);
		return this;
	}
	
	
	public PassengerDetails clickOnContinue() {
		clickByXpath(prop.getProperty("PassengerDetails.Continue.xpath"));
		return this;
	}
	
	
	public PassengerDetails verifyGstNumber(String text) {
		waitProperty(5000);
		verifyTextContainsByXpath(prop.getProperty("PassengerDetails.VerifyGst.xpath"), text);
		
		return this;
	}
	
	public PassengerDetails getTheHotelName() {
		getTextByXpath(prop.getProperty("PassengerDetails.HotelName.xpath"));
		
		return this;
	}
		
	//public PassengerDetails compareHotelName(String text) {	
		
		
		//verifyTextByXpath("//div[@class='mid-searchpack']", text);
	//	return this;
	//}
	
	public PassengerDetails getTheAmount() {
		getTextByXpath(prop.getProperty("PassengerDetails.Amount.xpath"));
	return this;	
	}
		
	
	//public PassengerDetails compareAmount(String text) {
	
		//verifyTextByXpath("//div[@class='faredetails-in faredetails-in-total']", text);
		//return this;
	//}
	
	public PassengerDetails clickOnAgree() {
		clickByXpath(prop.getProperty("PassengerDetails.Agree.xpath"));
		return this;
	}
	
	public PassengerDetails clickOnMakePayment() {
		clickByXpath(prop.getProperty("PassengerDetails.Payment.xpath"));
		return this;
	}
	public PassengerDetails clickOnVerify() {
		waitProperty(10000);
		
		clickByXpath(prop.getProperty("PassengerDetails.Verify.xpath"));
		return this;
	}
	
	public PassengerDetails verifyOtp(String text) {
		waitProperty(10000);
		verifyTextContainsByXpath(prop.getProperty("PassengerDetails.Otp.xpath"), text);
		
		return this;
	}
	
	
	
	
	
	
}
