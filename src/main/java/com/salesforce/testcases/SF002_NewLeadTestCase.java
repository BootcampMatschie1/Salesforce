package com.salesforce.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LeadsPage;
import com.salesforce.pages.LoginPage;

public class SF002_NewLeadTestCase extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateNewLead";
		testDescription ="Verify New Lead create functionality sucessfully";
		authors="Balaji";
		category ="Smoke";
		excelFileName="Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) throws InterruptedException, IOException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickAppsViewAll()
		.clickSalesMenu()
		.clickLeadsMenu()
		.clickNewLeads()
		.enterFirstname()
		.enterLastname()
		.enterCompanyname()
		.clickSave()
		.verifyLead();
		

	}

}
