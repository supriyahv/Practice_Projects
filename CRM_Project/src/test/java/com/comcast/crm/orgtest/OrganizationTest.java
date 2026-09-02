package com.comcast.crm.orgtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClassTest;
import com.comcast.crm.generic.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcast.crm.generic.objectrepositoryutility.HomePage;
import com.comcast.crm.generic.objectrepositoryutility.OrganizationInfoPage;
import com.comcast.crm.generic.objectrepositoryutility.OrganizationPage;

public class OrganizationTest extends BaseClassTest{
	
	@Test(groups="smokeTest")
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
	
	@Test(groups="regressionTest")
	public void createOrgWithIndustryTest() throws EncryptedDocumentException, IOException, InterruptedException {
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
	
	@Test(groups="regressionTest")
	public void createOrgWithPhoneNumberTest() throws EncryptedDocumentException, IOException {
		String orgname=eu.getDataFromExcel("Organization", 1, 2)+ju.getRandomNumber();
		String phonenumber=eu.getDataFromExcel("Organization", 7, 3).toString();//convert numberic to string data in excel
		
		
		HomePage hp = new HomePage(driver);
		//navigate org module
		hp.getOrgLink().click();
		//click on create organization
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateOrgLink().click();
		//Enter org name 
		CreateNewOrganizationPage cop=new CreateNewOrganizationPage(driver);
		cop.createOrg(orgname);
		//Enter phone number
		cop.createphoneNumber(phonenumber);
		//click on save button
		cop.clickOnSave();
		//verify the phone number
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actualphone = oip.getPhoneMsg().getText();
		Assert.assertEquals(actualphone, phonenumber);
		
		
	}

}
