package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetails extends GenericWrappers{

	public HotelDetails lastWindow() {
		switchToLastWindow();
		return this;
	}
	
	
	
	
	public HotelDetails getTheHotelName() {
		getTextByXpath(prop.getProperty("HotelDetails.HotelName.xpath"));
		return this;
	}
	
	
	public HotelDetails getThePrice() {
		waitProperty(3000);
		getTextByXpath(prop.getProperty("HotelDetails.Price.xpath"));
		return this;
	}
	
	public PassengerDetails clickOnContinueBooking() {
		waitProperty(5000);
		clickByXpath(prop.getProperty("HotelDetails.Booking.xpath"));
		return new PassengerDetails();
	}
	
	
	
	
	
	
}
