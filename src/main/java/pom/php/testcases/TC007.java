package pom.php.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpTravelRegistrationPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC007";
		testCaseDescription = "To verify Php Travels registration for the new user";
		author = "Sujatha";
		category = "smoke";
		browserName = "chrome";
		url = "https://www.phptravels.org/register.php";
		sheetname="TC007";
	}
	@Test(dataProvider="fetchData")
	public void phpTravels(String firstName, String lastName, String email, String country,String phone, String companyName, String city, String postcode, String state, 
			 String mobile, String password1, String password2, String address1, String address2) {
		
		new PhpTravelRegistrationPage()
		
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(email)
		.selectCountry(country)
        .enterPhoneNumber(phone)
        .enterCompanyName(companyName)
        .enterCity(city)
		.enterPostCode(postcode)
		.enterState(state)
		.enterMobile(mobile)
		.enterPassword(password1)
		.enterConfirmPassword(password2)
		.enterStreetAddress(address1)
        .enterStreetAddress2(address2)
		;
		
	}
	
	
}
