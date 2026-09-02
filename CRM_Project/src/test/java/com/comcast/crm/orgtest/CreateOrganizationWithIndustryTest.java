package com.comcast.crm.orgtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClassTest;
import com.comcast.crm.generic.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcast.crm.generic.objectrepositoryutility.HomePage;
import com.comcast.crm.generic.objectrepositoryutility.OrganizationInfoPage;
import com.comcast.crm.generic.objectrepositoryutility.OrganizationPage;

public class CreateOrganizationWithIndustryTest extends BaseClassTest {
	
	@Test
	public void createOrgTest() throws EncryptedDocumentException, IOException, InterruptedException {
		String orgname=eu.getDataFromExcel("Organization", 1, 2)+ju.getRandomNumber();
		String industry=eu.getDataFromExcel("Organization", 4, 3);
		String type=eu.getDataFromExcel("Organization", 4, 4);
		
		
		
		HomePage hp = new HomePage(driver);
		//navigate org module
		hp.getOrgLink().click();
		//click on create organization
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateOrgLink().click();
		//Enter org name & click on save button
		CreateNewOrganizationPage cop=new CreateNewOrganizationPage(driver);
		cop.createOrg(orgname);
		//Select Banking from Industry drop down
		wu.Select(cop.getIndustryDB(), industry);
		//select customer from type drop down
		wu.Select(cop.getTypeDB(), type);
		//click on save
		cop.clickOnSave();
		
		//validate industry
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actualIndustryMsg = oip.getIndustryMsg().getText();
		
		Assert.assertEquals(actualIndustryMsg, industry);
		
		//verify type
		String actualTypeMsg = oip.getTypeMsg().getText();
		
		Assert.assertEquals(actualTypeMsg, type);
		
	


		
		
		
	}

}
