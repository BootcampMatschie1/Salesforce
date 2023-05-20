package com.salesforce.pages;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
	
	
	
	

}
