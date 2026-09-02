package com.comcast.crm.generic.objectrepositoryutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {
	
	WebDriver driver;//global driver
	
	public CreateNewContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="lastname")
	private WebElement lastNameEdt;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img[@alt='Select']")
	private WebElement plusIcon;
	
	@FindBy(id="jscal_field_support_start_date")
	private WebElement startDate;
	
	@FindBy(id="jscal_field_support_end_date")
	private WebElement endDate;
	
	@FindBy(id="search_txt")
	private WebElement searchEdt;
	
	@FindBy(name="search")
	private WebElement searchBtn;
	
	
	

	public WebElement getSearchEdt() {
		return searchEdt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public void enterStartDate(String startdate) {
		startDate.clear();
		startDate.sendKeys(startdate);
	}
	
	public void enterEndDate(String enddate) {
		endDate.clear();
		endDate.sendKeys(enddate);
	}
	
	
	
	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createLastname(String lastname) {
		lastNameEdt.sendKeys(lastname);
	}
	
	public void clickOnSave() {
		saveBtn.click();
	}
	

	
	
	
	
	

}

