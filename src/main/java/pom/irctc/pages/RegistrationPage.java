package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers  {

	public RegistrationPage enterUserName(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.UserName.xpath"), data);
		
		return this;
	}
	
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.xpath"), data);
		
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.xpath"), data);
		return this;
	}
	
	
	public RegistrationPage clickOnPrefferedLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.PrefferedLanguage.xpath"));
		return this;
		
	}
	
	public RegistrationPage clickOnLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.Language.xpath"));
		return this;
	}
	
	
	public RegistrationPage clickOnSecurityQuestion() {
		
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.xpath"));
		return this;
	}
	
	public RegistrationPage clickOnQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.Question.xpath"));
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.xpath"), data);
		return this;
		
	}
	public RegistrationPage clickOnContinue() {
		clickByXpath(prop.getProperty("RegistrationPage.Continue.xpath"));
		return this;
	}
	
	
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.xpath"), data);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.xpath"), data);
		return this;
		
	}
	
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.LastName.xpath"), data);
		return this;
	}
	
	
	public RegistrationPage clickOnSelectOccupation() {
		
		clickByXpath(prop.getProperty("RegistrationPage.Occupation.xpath"));
		return this;
		
	}
	
	public RegistrationPage clickOnOccupation(String occ) {
		waitProperty(3000);
		clickByXpath(prop.getProperty("RegistrationPage.SelectOccupation.xpath"), occ);
		//clickByXpath(prop.getProperty("RegistrationPage.SelectOccupation.xpath"));
		return this;
	}
	
	public RegistrationPage clickOnDateOfBirth() {
		clickByXpath(prop.getProperty("RegistrationPage.DateOfBirth.xpath"));
		return this;
	}
	
	public RegistrationPage selectMonth(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.Month.xpath"), value);
		//clickByXpath("//option[text()='October']"];
		return this;
	}
	
	public RegistrationPage selectYear(String value) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.Year.xpath"), value);
		//clickByXpath("//option[text()='+year+']");
		return this;
	}
	
	public RegistrationPage clickOnDate(String date) {
		clickByXpath(prop.getProperty("RegistrationPage.Date.xpath"), date);
	//	clickByXpath(prop.getProperty("RegistrationPage.Date.xpath"));
		return this;
	}
	
	public RegistrationPage clickOnMartialStatus(String marstatus) {
		clickByXpath(prop.getProperty("RegistrationPage.Martial.xpath"), marstatus);
		//clickByXpath(prop.getProperty("RegistrationPage.Martial.xpath"), marstatus);
		return this;
	}
	public RegistrationPage clickOnGender(String gender) {
		clickByXpath(prop.getProperty("RegistrationPage.Gender.xpath"), gender);
		
		//clickByXpath(prop.getProperty("RegistrationPage.Gender.xpath"));
		return this;
	}
	public RegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Email.xpath"), data);
		return this;
	}
	public RegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile.xpath"), data);
		return this;
	}
	
	//public RegistrationPage clickOnNationality() {
		//clickByXpath("//select[@formcontrolname='nationality']");
		//return this;
	//}
		
		public RegistrationPage selectNationality(String value) {
			
		
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.Nationality.xpath"), value);
		return this;
		
	}
	
	public RegistrationPage clickOnContinueOne() {
		clickByXpath(prop.getProperty("RegistrationPage.ContinueOne.xpath"));
		return this;
	}
	
	public RegistrationPage enterFlat(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Flat.xpath"), data);
		return this;
	}
	
	public RegistrationPage enterStreet(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Street.xpath"), data);
		return this;
	}
	public RegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Area.xpath"), data);
		return this;
	}
	
	public RegistrationPage enterPinCode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Pincode.xpath"), data);
		return this;
	}
	
	public RegistrationPage enterState(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.State.xpath"), data);
		return this;
	}
	
	
	public RegistrationPage  selectCity(String value) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.City.xpath"), value);
		return this;
	}
	
	public RegistrationPage selectPostOffice(String value) {
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.PostOffice.xpath"), value);
		return this;
	}
	
	public RegistrationPage enterPhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Phone.xpath"), data);
		return this;
	}
	
	public RegistrationPage clickOnOfficeAddress() {
		clickByXpath(prop.getProperty("RegistrationPage.OfficeAddress.xpath"));
		return this;
	}
	
	public RegistrationPage enterOfficeFlat(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeFlat.xpath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeStreet.xpath"), data);
		return this;
	}
	public RegistrationPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeArea.xpath"), data);
		return this;
	}
	
	
	
	
	public RegistrationPage clickOnCountry() {
		clickByXpath(prop.getProperty("RegistrationPage.Country.xpath"));
		return this;
	}
		
	public RegistrationPage selectCountry(String country) {	
		waitProperty(3000);
		clickByXpath(prop.getProperty("RegistrationPage.SelectCountry.xpath"), country);
		//clickByXpath(prop.getProperty("RegistrationPage.SelectCountry.xpath"));
		return this;
	}
	
	
	public RegistrationPage enterOfficePin(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePin.xpath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeState(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeState.xpath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeCity(String data) {
		waitProperty(4000);
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.OfficeCity.xpath"), data);
		//enterByXpath(prop.getProperty("RegistrationPage.OfficeCity.xpath"), data);
		//clickByXpath(prop.getProperty("RegistrationPage.OfficeCity.xpath"));
		return this;
	}
	/*public RegistrationPage selectOffCity(String value) {
		waitProperty(2000);
		clickByXpath(prop.getProperty("RegistrationPage.SelectOffCity.xpath"), value);
		return this;
	}*/
	public RegistrationPage enterOfficePostOffice(String data) {
		waitProperty(4000);
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.OfficePostOffice.xpath"), data);
		//enterByXpath(prop.getProperty("RegistrationPage.OfficePostOffice.xpath"), data);
		return this;
	}
	
	
	

	public RegistrationPage enterOfficePhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePhone.xpath"), data);
		return this;
	}
	
	
	public RegistrationPage pageDown() {
		scrollDown();
		return this;
	}
	
	
	
	

	public RegistrationPage clickOnCheckBox() {
		waitProperty(2000);
		clickByXpath(prop.getProperty("RegistrationPage.CheckBox.xpath"));
		return this;
	}
	
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

