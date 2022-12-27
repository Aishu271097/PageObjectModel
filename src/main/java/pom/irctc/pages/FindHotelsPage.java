package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FindHotelsPage extends GenericWrappers{

	public FindHotelsPage lastWindow() {
		switchToLastWindow();
		return this;
	}
	
	
	
	public HotelDetails clickOnHotel() {
		waitProperty(3000);
		clickByXpath(prop.getProperty("FindHotel.Hotel.xpath"));
		return new HotelDetails();
		
	}
	
	
	
	
}
