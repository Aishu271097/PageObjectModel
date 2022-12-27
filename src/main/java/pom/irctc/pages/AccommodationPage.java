package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers {

	
	
	public AccommodationPage lastWindow() {
		switchToLastWindow();
		return this;
	}
	
	public AccommodationPage clickOnMenuIcon() {
		clickByXpath(prop.getProperty("AccommodationPage.MenuIcon.xpath"));
		return this;
	}
	

	public FtrPage clickOnBookYourCoach() {
		clickByXpath(prop.getProperty("AccommodationPage.BookCoach.xpath"));
		return new FtrPage();
	}
	
	public HotelsBooking clickOnHotels() {
		clickByXpath(prop.getProperty("AccommodationPage.Hotels.xpath"));
		return new HotelsBooking();
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("AccommodationPage.Charter.xpath"));
		return new CharterPage();
	}
	
	
	
	
	
	
}
