package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsBooking extends GenericWrappers{

	public HotelsBooking lastWindow() {
		switchToLastWindow();
		return this;
	}
	
	public HotelsBooking clickOnLogin() {
		clickByXpath(prop.getProperty("HotelsBooking.Login.xpath"));
		return this;
	}
	
	public HotelsBooking clickOnGuestLogin() {
		clickByXpath(prop.getProperty("HotelsBooking.GuestLogin.xpath"));
		return this;
	}
	
	public HotelsBooking enterEmail(String data) {
		enterByXpath(prop.getProperty("HotelsBooking.Email.xpath"), data);
		return this;
	}
	
	public HotelsBooking enterMobile(String data) { 
		enterByXpath(prop.getProperty("HotelsBooking.Mobile.xpath"), data);
		return this;                                            
	}

	public HotelsBooking clickOnLoginButton() {
		clickByXpath(prop.getProperty("HotelsBooking.LoginButton.xpath"));
		return this;
	}
	
	public HotelsBooking enterCity(String data) {
		waitProperty(3000);
		enterByXpath(prop.getProperty("HotelsBooking.City.xpath"), data);
		
		return this;
	}
	
	public HotelsBooking clickOnCity() {
		waitProperty(3000);
		clickByXpath(prop.getProperty("HotelsBooking.clickOnCity.xpath"));
		return this;
	}
	
	public HotelsBooking clickOnCheckInDate() {
		clickByXpath(prop.getProperty("HotelsBooking.clickOnCheckInDate.xpath"));
		return this;
	}
	
	public HotelsBooking clickOnCheckInYear() {
		waitProperty(3000);
		
		clickByXpath(prop.getProperty("HotelsBooking.clickOnCheckInYear.xpath"));
		return this;
	}
	
	public HotelsBooking selectCheckInYear(String year) {
		waitProperty(3000);
		clickByXpath(prop.getProperty("HotelsBooking.selectCheckInYear.xpath"), year);
		//clickByXpath(prop.getProperty("HotelsBooking.selectCheckInYear.xpath"), year);
		return this;
	}
	
	public HotelsBooking selectCheckInMonth(String month) {
		waitProperty(3000);
		clickByXpath(prop.getProperty("HotelsBooking.CheckInMonth.xpath"), month);
		//clickByXpath(prop.getProperty("HotelsBooking.CheckInMonth.xpath"), month);
		return this;
	}
	public HotelsBooking selectCheckInDate(String date) {
		waitProperty(5000);
		clickByXpath(prop.getProperty("HotelsBooking.CheckInDate.xpath"), date);
		//clickByXpath(prop.getProperty("HotelsBooking.CheckInDate.xpath"), date);
		return this;
	}
	
	public HotelsBooking clickOnCheckOutDate() {
		waitProperty(10000);
		clickByXpath(prop.getProperty("HotelsBooking.clickOnCheckOutDate.xpath"));
		return this;
	}
	
	public HotelsBooking clickOnCheckOutYear() {
		waitProperty(5000);
		clickByXpath(prop.getProperty("HotelsBooking.clickOnCheckOutYear.xpath"));
		return this;
	}
	
	public HotelsBooking selectCheckOutYear(String year) {
		waitProperty(5000);
		clickByXpath(prop.getProperty("HotelsBooking.selectCheckOutYear.xpath"), year);
		//clickByXpath(prop.getProperty("HotelsBooking.selectCheckOutYear.xpath"), year);
		return this;
	}
	
	public HotelsBooking selectCheckOutMonth(String month) {
		waitProperty(3000);
		clickByXpath(prop.getProperty("HotelsBooking.CheckOutMonth.xpath"), month);
		//clickByXpath(prop.getProperty("HotelsBooking.CheckOutMonth.xpath"), month);
		return this;
	}
	public HotelsBooking selectCheckOutDate(String date) {
		waitProperty(3000);
		clickByXpath(prop.getProperty("HotelsBooking.CheckOutDate.xpath"), date);
		//clickByXpath(prop.getProperty("HotelsBooking.CheckOutDay.xpath"), date);
		return this;
	}
	
	public HotelsBooking clickOnGuest() {
		clickByXpath(prop.getProperty("HotelsBooking.Guest.xpath"));
		return this;
	}
	
	    public HotelsBooking selectRooms(String value) {
	    	selectVisibleTextByXpath(prop.getProperty("HotelsBooking.Rooms.xpath"), value);
	    	return this;
	    }
	
	    public HotelsBooking selectAdults(String value) {
	    	selectVisibleTextByXpath(prop.getProperty("HotelsBooking.Adults.xpath"), value);
	    	return this;
	    }
	    
	    public HotelsBooking clickOnDone() {
			clickByXpath(prop.getProperty("HotelsBooking.Done.xpath"));
			return this;
		}
	    
	    public FindHotelsPage clickOnFindHotel() {
			clickByXpath(prop.getProperty("HotelsBooking.FindHotel.xpath"));
			return new FindHotelsPage();
		}
	    
	    
	
	
	
	
	
	
	
	
	
	
}
