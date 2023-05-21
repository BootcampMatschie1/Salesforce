package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewOpportunityPage extends ProjectSpecificMethods{
	public NewOpportunityPage EnterOpportunityName()
	 {
		WebElement element = locateElement(Locators.XPATH,"//label[text()='Opportunity Name']/following::input[1]");
		clearAndType(element,"Salesforce Automation by Ashmita");
//		
//	WebElement findElement = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input[1]"));
//	findElement.sendKeys("Salesforce Automation by Ashmita");
//	String attribute = findElement.getAttribute("value");
//	System.out.println(attribute);
	return this;
	 }
	public NewOpportunityPage chooseCloseDateAsToday()
	{
		WebElement element = locateElement(Locators.XPATH,"//label[text()='Close Date']/following::input[1]");
		element.click();
		
		WebElement element1 = locateElement(Locators.XPATH,"//label[text()='Close Date']//following::td[contains(@class,'is-today')]");
		element1.click();
		
	//Thread.sleep(5000);
	return this;
	}
	public NewOpportunityPage SelectStageAsNeedAnalysis()
	{

		WebElement element = locateElement(Locators.XPATH,"//span[text()='--None--']");
		element.click();
		WebElement element1 = locateElement(Locators.XPATH,"//span[@title='Needs Analysis']");
		element1.click();
	
	
	return this;
	}
	public VerifyOpportunityPage clickSaveButton()
	{  
		WebElement element = locateElement(Locators.XPATH,"//button[text()='Save']]");
		element.click();
	
	return new VerifyOpportunityPage(); 
			
	}
}
