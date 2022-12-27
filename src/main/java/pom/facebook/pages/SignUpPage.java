package pom.facebook.pages;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers{

	
	public SignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.FirstName.xpath"), data);
		return this;
	}
	
	public SignUpPage enterSurName(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.LastName.xpath"), data);
		return this;
	}
	
	public SignUpPage enterEmail(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.Email.xpath"), data);
		return this;
	}
	
	
	public SignUpPage enterConfirmEmail(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.ConfirmEmail.xpath"), data);
		return this;
	}
	
	public SignUpPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.Password.xpath"), data);
		return this;
	}
	
	
	public SignUpPage selectDay(String value) {
		selectVisibleTextByXpath(prop.getProperty("FacebookSignupPage.SelectDay.xpath"), value);
		return this;
	}
	
	
	public SignUpPage selectMonth(String value) {
		selectVisibleTextByXpath(prop.getProperty("FacebookSignupPage.SelectMonth.xpath"), value);
		return this;
	}
	
	public SignUpPage selectYear(String value) {
		selectVisibleTextByXpath(prop.getProperty("FacebookSignupPage.SelectYear.xpath"), value);
		return this;
	}
	
	
	public SignUpPage clickOnGender() {
		clickByXpath(prop.getProperty("FacebookSignupPage.Gender.xpath"));
		return this;
	}
	
}
