package com.comcast.crm.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement OrgLink;
	
	@FindBy(linkText="Contacts")
	private WebElement ContactLink;
	
	@FindBy(linkText="Campaigns")
	private WebElement CampaignsLink;
	
	@FindBy(linkText="More")
	private WebElement MoreLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminIcon;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutBtn;
	


	public WebElement getAdminIcon() {
		return adminIcon;
	}



	public WebElement getSignOutBtn() {
		return signOutBtn;
	}



	public WebElement getOrgLink() {
		return OrgLink;
	}



	public WebElement getContactLink() {
		return ContactLink;
	}
	

	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}



	public WebElement getMoreLink() {
		return MoreLink;
	}
	



	public void navigateToCampaginePage() {
		Actions action = new Actions(driver);
		action.moveToElement(MoreLink).perform();
		CampaignsLink.click();
	}

	public void Logout() {
		Actions action = new Actions(driver);
		action.moveToElement(adminIcon).perform();
		signOutBtn.click();
	}

}
