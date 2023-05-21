package com.salesforce.pages;

import org.openqa.selenium.By;

import com.framework.testng.api.base.ProjectSpecificMethods;


public class DashboardPage extends ProjectSpecificMethods{
	/**
	 * Dashboard page consists of following pages 1. DashboardListPage This page has
	 * methods like Create New Dashboard, Verification for created, Edited and
	 * Deleted Dashboard Names, Searching of Dashboard Names
	 */

	public DashboardPage newDash() {
		clickUsingJs(getDriver().findElement(By.xpath("//div[@title='New Dashboard']")));

		return this;

	}

	

	public void verifyCreatedDashboard() {
		verifyPartialText(getDriver().findElement(By.xpath("//a[contains(@title,'Nhivashini_Workout')]")),
				"Nhivashini_Workout");
	}

	public DashboardPage searchCreatedDashName() {

		typeAndEnter(getDriver().findElement(By.xpath("//input[contains(@class,'search-text-field slds-input')]")),
				"Nhivashini_Workout");
		return this;

	}

	

	public DashboardPage clickCreatedName() {
		clickUsingJs(getDriver().findElement(By.xpath("//a[contains(@title,'Nhivashini_Workout ')]")));
		return this;
	}
	
	

	/**
	 * 2. DashboardViewPage * This page has methods like Switch Frame, Save the
	 * Dashboard details, Navigate back to Dashboard List page, Edit the Dashboard
	 * details, Delete the Dashboard details.
	 */
	public DashboardPage switchframe() throws InterruptedException {
		switchToFrame(getDriver().findElement(By.xpath("//div[@class='dashboardContainer']//iframe")));
		return this;
	}
	

	public DashboardPage clickSave() throws InterruptedException {
		clickUsingJs(getDriver().findElement(By.xpath("//button[text()='Save']")));
		return this;
	}

	public DashboardPage defaultFrame() throws InterruptedException {
		defaultContent();
		return this; 
	}

	public DashboardPage clickDahboardLink() {

		clickUsingJs(getDriver().findElement(By.xpath("//span[text()='Dashboards']")));
		return this;

	}

	
	/**
	 * 4. NewDashboardPage * This page has methods like Typing name, Clicking Create
	 * button for new Dashbord
	 */

	public DashboardPage enterDashName(){

	
		typeAndEnter(getDriver().findElement(By.xpath("//input[@id='dashboardNameInput']")), "Nhivashini_Workout");

		return this;
	}

	public DashboardPage clickCreate() {
		clickUsingJs(getDriver().findElement(By.xpath("//button[text()='Create']")));

		return this;
	}
}
