package pom.alerts.pages;

import wrappers.GenericWrappers;

public class AlertPopUpPage extends GenericWrappers{

	public AlertsPage accept() {
		waitProperty(5000);
		acceptAlert();
		return new AlertsPage();
		
	}
	
	public AlertPopUpPage alertText() {
		getAlertText();
		return this;
	}
	
	
	
	
	public AlertsPage dismiss() {
		dismissAlert();
		return new AlertsPage();
	}
	
	
}
