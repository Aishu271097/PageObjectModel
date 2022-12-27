package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC003";
		testCaseDescription = "To submit enquiryform in Irctc charter";
		author = "Sujatha";
		category = "Functional";
		browserName = "chrome";
		url = "https://www.irctc.co.in/nget/train-search";
		sheetname="TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void saloonCheck(String name, String organization, String address, String mobile, String mail,String requestfor, String origin, 
			String dest, String indate, String outdate,
			String duration, String coach, String passenger, String charterpurpose, String services) {
		
		new HomePage()
		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.lastWindow()
		.clickOnMenuIcon()
		.clickOnCharter()
		.clickOnCloseMenu()
		.clickOnEnquiryForm()
		.enterApplicantName(name)
		.enterOrganisationName(organization)
		.enterAddress(address)
		.enterMobile(mobile)
		.enterEmail(mail)
		.selectRequestFor(requestfor)
		.enterOriginating(origin)
		.enterDestination(dest)
		.clickOnDateOfDeparture()
		.selectDateOfDeparture(indate)
		.clickOnDateOfArrival(outdate)
		//.selectDateOfArrival(outdate)
		.enterDurationPeriod(duration)
		.enterNumberAndTypeCoaches(coach)
		
		.enterNumberOfPassengers(passenger)
		.enterPurposeOfCharter(charterpurpose)
		.enterAdditionalSerivices(services)
		.clickOnSubmit()
		.verifyMobileNumber("not valid")
		;
	}

}
