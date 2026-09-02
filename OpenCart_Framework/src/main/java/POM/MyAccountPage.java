package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClass.BasePage;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement myaccounttext;

	public WebElement getMyaccounttext() {
		return myaccounttext;
	}
	
	public boolean isMyAccountPageExsist() {
		try {
		return myaccounttext.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

}
