package com.comcast.crm.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrganizationPage {
	
public CreateNewOrganizationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountname")
	private WebElement orgNameEdt;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(name="accounttype")
	private WebElement typeDB;
	
	@FindBy(name="industry")
	private WebElement industryDB;
	
	@FindBy(id="phone")
	private WebElement phoneNumberEdt;
	
	

	public WebElement getPhoneNumberEdt() {
		return phoneNumberEdt;
	}

	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createphoneNumber(String phonenumber) {
		phoneNumberEdt.sendKeys(phonenumber);
	}
	
	

	public void createOrg(String orgName) {
		orgNameEdt.sendKeys(orgName);
		
	}
	
	public void clickOnSave() {
		saveBtn.click();
	}
	
	
	
	public WebElement getIndustryDB() {
		return industryDB;
	}

	public WebElement getTypeDB() {
		return typeDB;
	}

	public void createOrg(String orgName,String industry) {
		orgNameEdt.sendKeys(orgName);
		Select s = new Select(industryDB);
		s.selectByVisibleText(industry);
		saveBtn.click();
	}

}
