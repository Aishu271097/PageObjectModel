package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {

	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC008";
		testCaseDescription = "To verify Facebook registration for the new user signup";
		author = "Sujatha";
		category = "smoke";
		browserName = "chrome";
		url = "https://www.facebook.com";
		sheetname="TC008";
	}
	
	
	@Test(dataProvider="fetchData")
	public void facebookSignup(String firstname, String lastname, String mail, String confirmmail, 
			String password, String day, String month, String year) {                                                                                                                                 
		
		new HomePage()
		.clickOnCreateAccount()
		.enterFirstName(firstname)
		.enterSurName(lastname)
		.enterEmail(mail)
		.enterConfirmEmail(confirmmail)
		.enterPassword(password)
		.selectDay(day)
		.selectMonth(month)
		.selectYear(year)
		.clickOnGender()
		;
	}
	
	
}
