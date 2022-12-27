package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {

	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC005";
		testCaseDescription = "To verify Gst validation while booking hotels in Irctc ";
		author = "Sujatha";
		category = "smoke";
		browserName = "chrome";
		url = "https://www.irctc.co.in/nget/train-search";
		sheetname="TC005";
	}
	
	@Test(dataProvider="fetchData")
	public void gstValidation(String mail,String mobile,String text,String inyear, String inmonth,String indate, String outyear, String outmonth, String outdate,String room,String adult, String title,String firstname, String lastname,
			String country, String state, String gst,String gstNum,String companyname,String companyaddress) {
		
		new HomePage()
		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.lastWindow()
		.clickOnHotels()
	.lastWindow()
		.clickOnLogin()
		.clickOnGuestLogin()
		.enterEmail(mail)
		.enterMobile(mobile)
		.clickOnLoginButton()
		.enterCity(text)
		.clickOnCity()
		.clickOnCheckInDate()
		.clickOnCheckInYear()
		.selectCheckInYear(inyear)
		
		.selectCheckInMonth(inmonth)
		.selectCheckInDate(indate)
		.clickOnCheckOutDate()
		.clickOnCheckOutYear()
		.selectCheckOutYear(outyear)
		.selectCheckOutMonth(outmonth)
		.selectCheckOutDate(outdate)
		.clickOnGuest()
		.selectRooms(room)
		.selectAdults(adult)
		.clickOnDone()
		
		.clickOnFindHotel()
		.lastWindow()
		.clickOnHotel()
		.lastWindow()
		.getTheHotelName()
		.getThePrice()
		.clickOnContinueBooking()
		.lastWindow()
		.selectTitle(title)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.selectCountry(country)
		.selectState(state)
		//.enterEmail("aishusujatha08@gmail.com")
		
		.selectGst(gst)
		.enterGstNumber(gstNum)
		.enterCompanyName(companyname)
		.enterCompanyAddress(companyaddress)
		.clickOnContinue()
		.verifyGstNumber("Please Enter Valid")
		
		;

		
		
		
		
		
	}
	
	
	
}
