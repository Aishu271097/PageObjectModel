package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class FrroRegistrationPage extends GenericWrappers {
	
	public FrroRegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.UserId.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Password.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.ConfirmPassword.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage selectSecQuestion(String value) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.SecQuestion.xpath"), value);
		return this;
		
	}
	
	public FrroRegistrationPage enterSecAnswer(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.SecAns.xpath"), data);
		return this;
		
	}
	
	
	public FrroRegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.UserName.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage selectGender(String value) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.Gender.xpath"), value);
		return this;
		
	}
	
	public FrroRegistrationPage enterDateOfBirth(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.DateOfBirth.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage enterDesignation(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Designation.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Email.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Mobile.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage enterPhone(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Phone.xpath"), data);
		return this;
		
	}

	
	public FrroRegistrationPage selectNationality(String value) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.Nationality.xpath"), value);
		return this;
		
	}
	
	
	public FrroRegistrationPage enterName(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Name.xpath"), data);
		return this;
		
	}

	
	public FrroRegistrationPage enterCapacity(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Capacity.xpath"), data);
		return this;
		
	}
	
	
	public FrroRegistrationPage enterAddress(String data) {
		
		enterByXpath(prop.getProperty("FrroRegistrationPage.Address.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage selectState(String value) {
		waitProperty(12000);
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.State.xpath"), value);
		
		return this;
		
	}
	
	
	
	public FrroRegistrationPage selectCity(String value) {
		waitProperty(5000);
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.City.xpath"), value);
		return this;
		
	}
	
	public FrroRegistrationPage selectAccomType(String value) {
		waitProperty(5000);
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.AccType.xpath"), value);
		return this;
		
	}
	
	
	public FrroRegistrationPage selectAccomGrade(String value) {
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.AccGrade.xpath"), value);
		return this;
		
	}
	
	public FrroRegistrationPage enterEmail1(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Email1.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage enterMobile1(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Mobile1.xpath"), data);
		return this;
		
	}
	
	
	public FrroRegistrationPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.PhoneNumber.xpath"), data);
		return this;
		
	}
	
	
	public FrroRegistrationPage enterName1(String data) {
		waitProperty(3000);
		
		enterByXpath(prop.getProperty("FrroRegistrationPage.Name1.xpath"), data);
		return this;
		
	}
	public FrroRegistrationPage enterAddress1(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Address1.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage selectState1(String value) {
		waitProperty(3000);
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.State1.xpath"), value);
		return this;
		
	}
	
	
	public FrroRegistrationPage selectCity1(String value) {
		waitProperty(3000);
		selectValueByXpath(prop.getProperty("FrroRegistrationPage.City1.xpath"), value);
		return this;
		
	}
	
	
	
	public FrroRegistrationPage enterEmail2(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Email2.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage enterPhone2(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Phone2.xpath"), data);
		return this;
		
	}
	
	public FrroRegistrationPage enterMobile2(String data) {
		enterByXpath(prop.getProperty("FrroRegistrationPage.Mobile2.xpath"), data);
		return this;
		
	}
	
	
	
	public FrroRegistrationPage clickOnAdd() {
		waitProperty(10000);
		clickByXpath(prop.getProperty("FrroRegistrationPage.Add.xpath"));
		return this;
	}
	
	
	
	
	
	
	
	
	
	
}
