package com.cast.crm.contacttest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClassTest;
import com.comcast.crm.generic.objectrepositoryutility.ContactInfoPage;
import com.comcast.crm.generic.objectrepositoryutility.ContactPage;
import com.comcast.crm.generic.objectrepositoryutility.CreateNewContactPage;
import com.comcast.crm.generic.objectrepositoryutility.HomePage;

public class CreateContactWithSupportDate extends BaseClassTest {
	
	@Test
	public void createContactWithSupportDateTest() throws EncryptedDocumentException, IOException, InterruptedException {
		
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
				//remove system end & start date-add start date
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//MM should be in upper case
				 String startdate = sdf.format(date);
				ccp.enterStartDate(startdate);
				//add end date
				Calendar cal = sdf.getCalendar();
				cal.add(Calendar.DAY_OF_MONTH,30);
				String enddate = sdf.format(cal.getTime());
				
				ccp.enterEndDate(enddate);
				
				ccp.clickOnSave();
				
				//validation for start & end date
				ContactInfoPage cip= new ContactInfoPage(driver);
				String actualstartdate = cip.getStartDateMsg().getText().trim();
				String actualenddate = cip.getEndDateMsg().getText().trim();
				
				Assert.assertEquals(actualstartdate, startdate);
				Assert.assertEquals(actualenddate, enddate);
				
				Thread.sleep(4000);
	}

}
