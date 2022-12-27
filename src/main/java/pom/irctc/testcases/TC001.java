package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001  extends ProjectWrappers  {

	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC001";
		testCaseDescription = "To verify IRCTC registration for the new user signup";
		author = "Sujatha";
		category = "smoke";
		browserName = "chrome";
		url = "https://www.irctc.co.in/nget/train-search";
		sheetname="TC001";
	}
	
	@Test(dataProvider="fetchData")
	
	
	public void irctcRegistration(String username, String password, String confirmpassword, String secanswer,String firstname, String middlename, String lastname, 
			String occupation, String month, String year, String date,String marstatus, String gender, String mail, String mobile, String nation,
			String address1, String address2, String address3, String pincode, String state, String city, String post, String phone,
			String offaddress1, String offaddress2, String offaddress3, String offpincode,String offstate,
			  String offcity,String offpost, String offphone,String country) {
		
		
		new HomePage()
		
		.clickOnRegister()
		.enterUserName(username)
		.enterPassword(password)
		.enterConfirmPassword(confirmpassword)
		.clickOnPrefferedLanguage()
		.clickOnLanguage()
		.clickOnSecurityQuestion()
		.clickOnQuestion()
		.enterSecurityAnswer(secanswer)
		.clickOnContinue()
		.enterFirstName(firstname)
		.enterMiddleName(middlename)
		.enterLastName(lastname)
		.clickOnSelectOccupation()
		
		.clickOnOccupation(occupation)
		
		.clickOnDateOfBirth()
		.selectMonth(month)
		.selectYear(year)
		
				.clickOnDate(date)
		
		.clickOnMartialStatus(marstatus)
		.clickOnGender(gender)
		.enterEmail(mail)
		.enterMobile(mobile)
		//.clickOnNationality()
		.selectNationality(nation)
		.clickOnContinueOne()
		
		.enterFlat(address1)
		.enterStreet(address2)
		.enterArea(address3)
       .enterPinCode(pincode)
      
       .enterState(state)
       .selectCity(city)
       .selectPostOffice(post)
       .enterPhone(phone)
       
       .clickOnOfficeAddress()
       .enterOfficeFlat(offaddress1)
       .enterOfficeStreet(offaddress2)
       .enterOfficeArea(offaddress3)
       .pageDown()
       .enterOfficePin(offpincode)
       
       .enterOfficeState(offstate)
      
       .enterOfficeCity(offcity)
       //.selectOffCity(offcity)
       .enterOfficePostOffice(offpost)
       
       .enterOfficePhone(offphone)
.clickOnCountry()
       
       .selectCountry(country)
       .pageDown()
       .clickOnCheckBox()
       
       ;
		
		
       
       
       
       
       
       
       
       
	}
	
	
	
}
