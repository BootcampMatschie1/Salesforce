package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
public class EditOpportunityPage extends ProjectSpecificMethods {
	
	public EditOpportunityPage() {
		
		
	}
	public EditOpportunityPage editEnterNewOpportunityName() {
		
		WebElement findOpName = locateElement(Locators.XPATH, "//label[text()='Opportunity Name']/following::input[1]");
		clearAndType(findOpName, "Salesforce Automation by Suzzane");
		String attribute = getAttribute(findOpName, "value1");
		return this;
	
		}
	
	public EditOpportunityPage editCloseDateAsTomorrowDate() {
		String chooseTomorrowDate = chooseTomorrowDate();
		WebElement closeDate = locateElement(Locators.XPATH,"//label[text()='Close Date']/following-sibling::div//input");
		closeDate.clear();
		closeDate.sendKeys(chooseTomorrowDate);
		return this;
		
	}

	
	
	

}
