package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.LINK_TEXT,"CRM/SFA"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	
	public HomePage clickAppLauncher() {
		
		return this;
	}
	
	public AppLauncherPage clickViewAll() {
		
		return new AppLauncherPage();
	}
	
	
}
