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

public class CreateOrganizationWithPhoneNumber extends BaseClassTest {
	
	@Test
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
