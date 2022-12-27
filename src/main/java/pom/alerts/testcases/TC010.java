package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.AlertsPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC010";
		testCaseDescription = "To verify Confirmation Alert";
		author = "Sujatha";
		category = "smoke";
		browserName = "chrome";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}
	
	
	@Test
	public void confirmationAlert() {
		
		new AlertsPage()
		.switchToFrame()
		.clickOnTryIt()
		.alertText()
		.accept()
		.verifyName("You pressed OK!")
		.refresh()
		.switchToFrame()
		.clickOnTryIt()
		.alertText()
		.dismiss()
		.verifyName("You pressed Cancel!")
		.defaultframe()
		.clickOnHome()
		;
	}
	
	
	
}
