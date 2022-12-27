package pom.alerts.pages;

import wrappers.GenericWrappers;

public class AlertsPage extends GenericWrappers{

	
	public AlertsPage switchToFrame() {
		waitProperty(3000);
		switchToAlert(prop.getProperty("AlertsPage.Frame.xpth"));
		return this;
	}
	
	
	public AlertsPage clickOnTryIt() {
		waitProperty(5000);
		clickByXpathNoSnap(prop.getProperty("AlertsPage.Tryit.xpth"));
		return this;
	}
	
	public AlertsPage enterAlert(String data) {
		waitProperty(5000);
		enterInAlert(data);
		return this;
	}
	
	public AlertsPage alertText() {
		waitProperty(4000);
		getAlertText();
		return this;
	}
	
	
	public AlertsPage accept() {
		acceptAlert();
		return this;
		
	}
	
	public AlertsPage verifyName(String text) {
		
		verifyTextContainsByXpath(prop.getProperty("AlertsPage.VerifyName.xpth"), text);
		return this;
		
	}
	
	
	
	public AlertsPage refresh() {
		
		refreshScreen();
		return this;
		
	}
	public AlertsPage dismiss() {
		dismissAlert();
		return this;
	}
	
	public AlertsPage defaultframe() {
		waitProperty(5000);
		defaultContent();
		return this;
	}
	
	
	
	
	public SchoolHomePage clickOnHome() {
		clickByXpath(prop.getProperty("AlertsPage.SchoolHome.xpth"));
		return new SchoolHomePage();
	}
	
	
	
	}
