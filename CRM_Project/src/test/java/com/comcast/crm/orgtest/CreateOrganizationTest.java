package com.comcast.crm.orgtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClassTest;
import com.comcast.crm.generic.fileutility.ExeclUtility;
import com.comcast.crm.generic.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcast.crm.generic.objectrepositoryutility.HomePage;
import com.comcast.crm.generic.objectrepositoryutility.OrganizationInfoPage;
import com.comcast.crm.generic.objectrepositoryutility.OrganizationPage;
import com.comcast.crm.generic.webdriverutility.JavaUtility;

public class CreateOrganizationTest extends BaseClassTest {
	
	@Test
	public void createOrgTest() throws EncryptedDocumentException, IOException {
		String orgname=eu.getDataFromExcel("Organization", 1, 2)+ju.getRandomNumber();
		
		
		HomePage hp = new HomePage(driver);
		//navigate org module
		hp.getOrgLink().click();
		//click on create organization
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateOrgLink().click();
		//Enter org name & click on save button
		CreateNewOrganizationPage cop=new CreateNewOrganizationPage(driver);
		cop.createOrg(orgname);
		cop.clickOnSave();
		//validate header message
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actualMsg = oip.getHeaderMsg().getText();
		
		Assert.assertTrue(actualMsg.contains(orgname));
		
		//verify header orgname with expected result[orgname text feild]
		String actualOrgName = oip.getOrgNameMsg().getText().trim();
		
		Assert.assertEquals(actualOrgName, orgname);
		
	


		
		
		
	}

}
