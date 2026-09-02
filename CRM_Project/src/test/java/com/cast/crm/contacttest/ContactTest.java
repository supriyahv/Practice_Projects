package com.cast.crm.contacttest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClassTest;
import com.comcast.crm.generic.objectrepositoryutility.ContactInfoPage;
import com.comcast.crm.generic.objectrepositoryutility.ContactPage;
import com.comcast.crm.generic.objectrepositoryutility.CreateNewContactPage;
import com.comcast.crm.generic.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcast.crm.generic.objectrepositoryutility.HomePage;
import com.comcast.crm.generic.objectrepositoryutility.OrganizationInfoPage;
import com.comcast.crm.generic.objectrepositoryutility.OrganizationPage;

public class ContactTest extends BaseClassTest{
	
	@Test(groups="smokeTest")
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
		//boolean headerstatus=headerMsg.contains(lastname);
		//Assert.assertEquals(headerstatus, true);
		Assert.assertTrue(headerMsg.contains(lastname));
		
		String lastName=cip.getLastNameMsg().getText().trim();
		//Reporter.log(lastName); system.out.println you can use reporter.
		Assert.assertEquals(lastName, lastname);
		
		
	}
	
	@Test(groups="regressionTest")
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
	
	@Test(groups="regressionTest")
	public void createContactWithOrgTest() throws EncryptedDocumentException, IOException, InterruptedException {
		String orgname = eu.getDataFromExcel("Contact", 4, 2) + ju.getRandomNumber();

		// precondition -create organization first

		HomePage hp = new HomePage(driver);
		// navigate org module
		hp.getOrgLink().click();
		// click on create organization
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateOrgLink().click();
		// Enter org name & click on save button
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
		cop.createOrg(orgname);
		cop.clickOnSave();
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actualOrgName = oip.getOrgNameMsg().getText().trim();

		Assert.assertEquals(actualOrgName, orgname);

		// read testscrip data from Excel
		String lastname = eu.getDataFromExcel("Contact", 1, 2);

		// navigate to contact module

		hp.getContactLink().click();

		// click on create contact button
		ContactPage cp = new ContactPage(driver);
		cp.getCreateContactLink().click();

		// Enter lastname
		CreateNewContactPage ccp = new CreateNewContactPage(driver);
		ccp.createLastname(lastname);

		// click on add org name
		ccp.getPlusIcon().click();
		// switch from parent window to child window
		wu.switchNewBrowserTabOnTitle(driver,
				"http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
		Thread.sleep(2000);
		ccp.getSearchEdt().sendKeys(orgname);
		ccp.getSearchBtn().click();
		driver.findElement(By.xpath("//a[text()='" + orgname + "']")).click();// dynamic orgname

		// switch from child to parent
		wu.switchNewBrowserTabOnTitle(driver,
				"http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");
		Thread.sleep(2000);
		ccp.clickOnSave();

		ContactInfoPage cip = new ContactInfoPage(driver);
		String actualheaderMsg = cip.getHeaderMsg().getText();
		// verify header msg
		Assert.assertTrue(actualheaderMsg.contains(lastname));
		// verify the orgname in contact module
		String actualcontactorgname = cip.getOrgNameMsg().getText().trim();
		Assert.assertEquals(actualcontactorgname, orgname);

	}

}
