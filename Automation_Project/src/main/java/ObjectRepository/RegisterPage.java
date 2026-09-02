package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstNameField;
	
	public void enterFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}
	
	@FindBy(id="input-lastname")
	private WebElement lastNameFeild;
	
	public void enterlastFirstName(String lastname) {
		lastNameFeild.sendKeys(lastname);
	}
	
	@FindBy(id="input-email")
	private WebElement emailFeild;
	
	public void enterEmail(String email) {
		emailFeild.sendKeys(email);
	}
	
	@FindBy(id="input-telephone")
	private WebElement telephoneFeild;
	
	public void enterTelephone(String telephone) {
		telephoneFeild.sendKeys(telephone);
	}
	
	@FindBy(id="input-password")
	private WebElement passwordFeild;
	
	public void enterPassword(String password) {
		passwordFeild.sendKeys(password);
	}

	@FindBy(id="input-confirm")
	private WebElement conformPasswordFeild;
	
	public void enterConfirmPassword(String confirmpassword) {
		conformPasswordFeild.sendKeys(confirmpassword);
	}
	
	@FindBy(name="agree")
	private WebElement agreeCheckBox;
	
	public void clickOnAgreeCheckBox() {
		agreeCheckBox.click();	
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	public AccountSuccessPage clickOnContinueButton() {
		continueButton.click();
		return new AccountSuccessPage(driver);
	}

}
