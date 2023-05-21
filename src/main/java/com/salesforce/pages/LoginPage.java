package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername(String uName) {
		// step1: locate the element
		WebElement eleUsername = locateElement("username");

		// step2: interact with the weblement
		clearAndType(eleUsername, uName);
		
		return this;
	}

	public LoginPage enterPassword(String passWord) {

		// step1: locate the element
		WebElement elePassword = locateElement(Locators.XPATH,"//input[@id='password']");

		// step2: interact with the weblement
		clearAndType(elePassword, passWord);
		
		return this;

	}

	public HomePage clickLogin() {
		
		click(locateElement(Locators.ID, "Login"));
		return new HomePage();

	}

}
