package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.AlertsPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC011";
		testCaseDescription = "To verify Simple Alert";
		author = "Sujatha";
		category = "smoke";
		browserName = "chrome";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	
	@Test
	
	public void simpleAlert() {
		
		new AlertsPage()
		.switchToFrame()
		.clickOnTryIt()
		//.alertText()
		//.accept()
		.defaultframe()
		.clickOnHome();
		
	}
	
}
