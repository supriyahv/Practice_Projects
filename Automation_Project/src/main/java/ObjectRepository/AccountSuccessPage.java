package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {
	
	WebDriver driver;
	
	public AccountSuccessPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@id='content']//h1")
	private WebElement accountSuccessText;
	
	public boolean accountSuccessMeassage() {
		return accountSuccessText.isDisplayed();
		
	}
	
	@FindBy(id="content")
	private WebElement successmessage;
	
	public String accountSuccessDetails() {
		return successmessage.getText();
		
	}
	
	@FindBy(linkText="Continue")
	private WebElement continueBtn;
	
	public void clickOnContinue() {
		continueBtn.click();
	}
	
	@FindBy(linkText="Edit your account information")
	private WebElement accountInformation;
	
	public boolean  accountInformationText() {
		return accountInformation.isDisplayed();
	}
}
