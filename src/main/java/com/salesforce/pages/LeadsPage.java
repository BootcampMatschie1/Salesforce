package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {

	public LeadsPage clickNewLeads() throws InterruptedException {
		click(locateElement(Locators.XPATH, "//div[@title='New']"));
	
	//	WebElement leads = locateElement("//span[text()='Leads']"));
	//	driver.executeScript("arguments[0].click();", leads);
		
		Thread.sleep(4000);
		return this;
		}

	
		
	public LeadsPage enterFirstname() throws InterruptedException {
		// step1: locate the element
		WebElement eleFirstname = locateElement("(//input[@class='slds-input'])[3]");

		// step2: interact with the weblement
		clearAndType(eleFirstname, "Balaji");
		return this;
		
		}
	
	public LeadsPage enterLastname() throws InterruptedException {
		// step1: locate the element
		WebElement eleLastname = locateElement("(//input[@class='slds-input'])[4]");

		// step2: interact with the weblement
		clearAndType(eleLastname, "Sripathi");
		return this;
		
		}
	
	public LeadsPage enterCompanyname() throws InterruptedException {
		// step1: locate the element
		WebElement eleCompanyname = locateElement("//label[text()='Company']/following::input");

		// step2: interact with the weblement
		clearAndType(eleCompanyname, "Testleaf");
		return this;
		
		}
	
	public LeadsPage clickSave() throws InterruptedException {
		click(locateElement(Locators.XPATH, "//button[@class='slds-button slds-button_brand']"));
		Thread.sleep(4000);
		return this;
		
		
		}
	
	public LeadsPage verifyLead() throws InterruptedException {
		// step1: locate the element
		WebElement newLead = locateElement("(//span[contains(text(),'Lead')])[8]");
		Thread.sleep(2000);
		String confirmmsg = newLead.getText();
		System.out.println(confirmmsg+ " successfully");
		return this;
		
		}
	
	
}
