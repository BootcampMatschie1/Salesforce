package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods {

	public void clickLegalEntity() {
		
	}
	
	public void clickOppourtunity() {
		
	}
	
	public HomePage clickSalesMenu() {
		click(locateElement(Locators.XPATH, "//p[text()='Sales']"));
		return new HomePage();
	}
}
