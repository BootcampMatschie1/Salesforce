package com.salesforce.pages;

import org.openqa.selenium.By;

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

	public DashboardPage clickDashboard() {
		clickUsingJs(getDriver().findElement(By.xpath("//p[text()='Dashboards']")));
		return new DashboardPage();
	
	}
}
