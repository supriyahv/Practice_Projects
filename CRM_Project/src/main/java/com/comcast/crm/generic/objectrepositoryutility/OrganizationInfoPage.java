package com.comcast.crm.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrganizationInfoPage {
	
	WebDriver driver;
	
public OrganizationInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement headerMsg;

	@FindBy(id="mouseArea_Organization Name")
	private WebElement orgNameMsg;
	
	@FindBy(id="mouseArea_Industry")
	private WebElement industryMsg;
	
	@FindBy(id="mouseArea_Type")
	private WebElement typeMsg;
	
	@FindBy(id="dtlview_Phone")
	private WebElement phoneMsg;
	
	
	

	public WebElement getPhoneMsg() {
		return phoneMsg;
	}


	public WebElement getIndustryMsg() {
		return industryMsg;
	}


	public WebElement getTypeMsg() {
		return typeMsg;
	}


	public WebElement getHeaderMsg() {
		return headerMsg;
	}


	public WebElement getOrgNameMsg() {
		return orgNameMsg;
	}
	
	

}
