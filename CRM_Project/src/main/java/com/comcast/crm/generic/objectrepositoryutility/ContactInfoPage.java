package com.comcast.crm.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {
	WebDriver driver;
	
	public ContactInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="mouseArea_Last Name")
	private WebElement lastNameMsg;
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement headerMsg;
	
	@FindBy(id="dtlview_Support Start Date")
	private WebElement startDateMsg;
	
	@FindBy(id="mouseArea_Support End Date")
	private WebElement endDateMsg;
	
	
	@FindBy(id="mouseArea_Organization Name")
	private WebElement orgNameMsg;
	

	public WebElement getOrgNameMsg() {
		return orgNameMsg;
	}



	public WebElement getStartDateMsg() {
		return startDateMsg;
	}



	public WebElement getEndDateMsg() {
		return endDateMsg;
	}



	public WebElement getHeaderMsg() {
		return headerMsg;
	}



	public WebElement getLastNameMsg() {
		return lastNameMsg;
	}
	
	

}
