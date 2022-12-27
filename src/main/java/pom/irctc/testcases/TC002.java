package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{

	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC002";
		testCaseDescription = "To verify Ftr registration for the new user signup";
		author = "Sujatha";
		category = "smoke";
		browserName = "chrome";
		url = "https://www.irctc.co.in/nget/train-search";
		sheetname="TC002";
	}
	
	@Test(dataProvider="fetchData")
	public void bookYourCoach(String userid, String password, String confirmpassword, String secq, String secans, String month, 
			String year, String date,String gender, String marital,String mail,String occupation, String firstname, String middlename, String lastname, String nation, 
			String flat, String street, String area, String country, String mobile, String pincode,String city1,
			String state1, String postoffice1, String flat2, 
			String street2, String area2, String mobile2, String Country1,String pincode2 , String city2, String state2, String postoffice2) {
		
		
		new HomePage()
		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.lastWindow()
		.clickOnMenuIcon()
		.clickOnBookYourCoach()
		.lastWindow()
		.clickOnSignUp()
		
		.enterUserId(userid)
		.enterPassword(password)
		.enterConfirmPassword(confirmpassword)
		.selectSecurityQuestion(secq)
		.enterSecurityAns(secans)
		.clickOnDateOfBirth()
		.SelectMonth(month)
		.SelectYear(year)
		.clickOnDate(date)
		.clickOnGender(gender)
		.clickOnMaritalStatus(marital)
		.enterEmail(mail)
		.selectOccupation(occupation)
		.enterFirstName(firstname)
		.enterMiddleName(middlename)
		.enterLastName(lastname)
		.selectNationality(nation)
		.pageDown()
		.enterFlat(flat)
		.enterStreet(street)
		.enterArea(area)
		.selectCountry(country)
		.enterMobile(mobile)
		
		.enterPinCode(pincode)
		.pageDown()
		.selectCity(city1)
		.selectState(state1)
		.selectPostOffice(postoffice1)
		
		.clickOnCopyResidentialAdd()
		
		.enterOfficeFlat(flat2)
		.enterOfficeStreet(street2)
		.enterOfficeArea(area2)
		.enterOfficeMobile(mobile2)
		.selectOfficeCountry(Country1)
		
		.enterOfficePinCode(pincode2)
		.pageDown()
		.selectOfficeCity(city2)
		.selectOfficeState(state2)
		.selectOffPostOffice(postoffice2)
		;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
