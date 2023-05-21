package com.salesforce.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class TC_15_CreateNewDashboard extends ProjectSpecificMethods {
	private String testCaseName;

	@BeforeTest
	public void setValues() {
		testCaseName = "TC_15_CreatNewDashboard";
		testDescription = "Create New Dashboard";
		authors = "Nhivashini";
		category = "Smoke";
		excelFileName = "Login";
		
	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String uName, String pwd) throws IOException, InterruptedException {

		new LoginPage().enterUsername(uName).enterPassword(pwd).clickLogin().clickAppLauncher()

				.clickViewAll().clickDashboard().newDash()
				.switchframe().enterDashName().clickCreate().switchframe().clickSave()
				.defaultFrame().clickDahboardLink().verifyCreatedDashboard();
	}
}
