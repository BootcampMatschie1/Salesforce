package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods {

	public void clickLegalEntity() {

	}

	public void clickOppourtunity() {

	}
	
	public OpportunityTabPage clickSales() {
		WebElement element = locateElement(Locators.XPATH,"//p[text()='Sales']" );
		element.click();
		return new OpportunityTabPage(); 
	}
	
	public HomePage clickSalesMenu() {
		click(locateElement(Locators.XPATH, "//p[text()='Sales']"));
		return new HomePage();
	}
}

