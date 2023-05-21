package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class OpportunityTabPage extends ProjectSpecificMethods 
	
	{
		

		public OpportunityTabPage clickOpportunityTab()
		{
			WebElement locateElement = locateElement(Locators.XPATH,"(//span[text()='Opportunities'])[1]");
			clickUsingJs(locateElement);
			return this;
		}

		public NewOpportunityPage clickNewButton()
		{
			WebElement locateElement = locateElement(Locators.XPATH,"//div[text()='New']");
			locateElement.click();
			return new NewOpportunityPage(); 
		}
	}


