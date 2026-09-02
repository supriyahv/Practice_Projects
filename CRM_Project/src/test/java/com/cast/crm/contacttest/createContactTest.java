package com.cast.crm.contacttest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClassTest;
import com.comcast.crm.generic.objectrepositoryutility.ContactInfoPage;
import com.comcast.crm.generic.objectrepositoryutility.ContactPage;
import com.comcast.crm.generic.objectrepositoryutility.CreateNewContactPage;
import com.comcast.crm.generic.objectrepositoryutility.HomePage;

public class createContactTest extends BaseClassTest {
	
	@Test
	public void createContactTest() throws EncryptedDocumentException, IOException {
		
		
		
		//read testscrip data from Excel
		String lastname=eu.getDataFromExcel("Contact", 1, 2);
		
		//navigate to contact module
		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();
		
		//click on create contact button
		ContactPage cp = new ContactPage(driver);
		cp.getCreateContactLink().click();
		
		//Enter lastname
		CreateNewContactPage ccp = new CreateNewContactPage(driver);
		ccp.createLastname(lastname);
		//click on save
		ccp.clickOnSave();
		//verify the lastname
		ContactInfoPage cip = new ContactInfoPage(driver);
		//verify the header Msg
		String headerMsg = cip.getHeaderMsg().getText().trim();
		
		Assert.assertTrue(headerMsg.contains(headerMsg));
		
		String lastName=cip.getLastNameMsg().getText().trim();
		Assert.assertEquals(lastName, lastname);
		
		
	}

}
