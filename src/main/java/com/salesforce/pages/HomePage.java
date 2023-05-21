package com.salesforce.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.LINK_TEXT,"CRM/SFA"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}

	public HomePage clickAppLauncher() {
		click(getDriver().findElement(By.className("slds-icon-waffle")));
		return this;
	}

	public AppLauncherPage clickViewAll() {
		click(locateElement(Locators.XPATH, "//lightning-button[@class='slds-button slds-p-horizontal--small']//button[text()='View All']"));
		return new AppLauncherPage();
	}

	public LeadsPage clickLeadsMenu() throws IOException {
		click(locateElement(Locators.XPATH, "//span[text()='Leads']"));
		return new LeadsPage();

	}
}
