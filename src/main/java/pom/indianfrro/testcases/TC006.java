package pom.indianfrro.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.pages.FrroHomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC006";
		testCaseDescription = "To verify IndianFrro registration for the new user signup";
		author = "Sujatha";
		category = "smoke";
		browserName = "chrome";
		url = "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetname="TC006";
	}
	
	@Test(dataProvider="fetchData")
	public void indianFrro(String userid, String password,String confirmpassword, String secq,String secans,String name,String gender,String dob,String designation,String mail,String mobile,String phone,String nation,
			String name1,String capacity,String address,String state,String city,String accomadation,String rating,String email,String contact,String contact1,String name2,
			String address1,String state1,String city1,String mail1,String phone1,String mobile1,String name3,
			String address2,String state2,String city2,String mail2,String phone2,String mobile2,String name4,
			String address3,String state3,String city3,String mail3,String phone3,String mobile3) {
		
		new FrroHomePage()
		.clickOnSignUp()
		.enterUserId(userid)
		.enterPassword(password)
		.enterConfirmPassword(confirmpassword)
		.selectSecQuestion(secq)
		.enterSecAnswer(secans)
		.enterUserName(name)
		.selectGender(gender)
		.enterDateOfBirth(dob)
		.enterDesignation(designation)
		.enterEmail(mail)
		.enterMobile(mobile)
		.enterPhone(phone)
		.selectNationality(nation)
		.enterName(name1)
		.enterCapacity(capacity)
		.enterAddress(address)
		.selectState(state)
		.selectCity(city)
		.selectAccomType(accomadation)
		.selectAccomGrade(rating)
		.enterEmail1(email)
		.enterMobile1(contact)
		.enterPhoneNumber(contact1)
		.enterName1(name2)
		.enterAddress1(address1)
		.selectState1(state1)
		.selectCity1(city1)
		.enterEmail2(mail1)
		.enterPhone2(phone1)
		.enterMobile2(mobile1)
		.clickOnAdd()		
		.enterName1(name3)
		.enterAddress1(address2)
		.selectState1(state2)
		.selectCity1(city2)
		.enterEmail2(mail2)
		.enterPhone2(phone2)
		.enterMobile2(mobile2)
		.clickOnAdd()
		
		.enterName1(name4)
		.enterAddress1(address3)
		.selectState1(state3)
		
		.selectCity1(city3)
		.enterEmail2(mail3)
		.enterPhone2(phone3)
		.enterMobile2(mobile3)
		.clickOnAdd()
		;
	}
	

}
