package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.Register.xpath"));
		return new RegistrationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath(prop.getProperty("HomePage.Holidays.xpath"));
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath(prop.getProperty("HomePage.Stays.xpath"));
		return this;
	}
	
	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.Lounge.xpath"));
		return new AccommodationPage();
	}
	
	
	
	
	
	
}
